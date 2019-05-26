package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001597;
import irvine.util.RuntimeUtils;

/**
 * A023055 (Apparently) differences between adjacent perfect powers (integers of form <code>a^b, a &gt;= 1, b &gt;= 2)</code>.
 * @author Sean A. Irvine
 */
public class A023055 extends A023056 {

  // Only searches a certain distance, do not use to extend sequence

  private static final int MAX_TERMS = RuntimeUtils.isTest() ? 200000 : 100000000;
  private final TreeSet<Z> mDifferences = new TreeSet<>();
  private Z mN = Z.ZERO;
  {
    // One of computation of differences up to some limit
    final Sequence s = new A001597();
    Z a = s.next();
    for (int k = 0; k < MAX_TERMS; ++k) {
      final Z b = s.next();
      mDifferences.add(b.subtract(a));
      a = b;
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mDifferences.contains(mN)) {
        return mN;
      }
    }
  }
}
