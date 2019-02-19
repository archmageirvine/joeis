package irvine.oeis.a198;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A198683.
 * @author Sean A. Irvine
 */
public class A198683 implements Sequence {

  // todo this locks trying to compute exp(0) abd getting stuck

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  // A map from an expression size to the set of all expressions of that size
  private ArrayList<Set<CC>> mExpressionsOfSize = new ArrayList<>();
  {
    mExpressionsOfSize.add(null); // 0th
    mExpressionsOfSize.add(Collections.singleton(CC.I));
  }

  private static final int TOLERANCE = 0;

  // Returns the set of all expressions of a given size.
  //
  // Fetches the result from <see cref="mExpressionsOfSize"/> if it has been already computed;
  // otherwise computes the set by constructing expressions using smaller expressions for bases and exponents
  // and removing duplicates, and then returns the result after storing it in <see cref="mExpressionsOfSize"/>.
  private Set<CC> getExpressionsOfSize(final int size) {
    assert size > 0;
    while (size >= mExpressionsOfSize.size()) {
      final int n = mExpressionsOfSize.size();
      final TreeSet<CC> result = new TreeSet<>((o1, o2) -> {
        final int c = o1.re().compareTo(o2.re(), TOLERANCE);
        if (c != 0) {
          return c;
        }
        return o1.im().compareTo(o2.im(), TOLERANCE);
      });
      for (int i = 1; i < n; ++i) {
        for (final CC base : getExpressionsOfSize(i)) {
          for (final CC exponent : getExpressionsOfSize(n - i)) {
            System.out.println("Trying: (" + base + ")^(" + exponent + ")");
            result.add(ComputableComplexField.SINGLETON.pow(base, exponent));
          }
        }
      }
      mExpressionsOfSize.add(result);
    }
    return mExpressionsOfSize.get(size);
  }

  private int mN = 0;
  private long mStart = System.currentTimeMillis();

  @Override
  public Z next() {
    final int count = getExpressionsOfSize(++mN).size();
    if (mVerbose) {
      StringUtils.message("a(" + mN + ")=" + count + " " + DoubleUtils.NF2.format((System.currentTimeMillis() - mStart) / 1000.0) + "s");
    }
    return Z.valueOf(count);
  }
}
