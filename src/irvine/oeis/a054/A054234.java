package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;
import irvine.util.string.StringUtils;

/**
 * A054234 Consider all integer triples (i,j,k), j,k&gt;0, with i^3=j^3+binomial(k+2,3), ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A054234 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<Triple<Long>> mA = new ArrayList<>();
  private long mN = 3;
  private int mM = 0;

  protected long select(final Triple<Long> t) {
    if (mVerbose) {
      StringUtils.message(t.toString());
    }
    return t.left();
  }

  @Override
  public Z next() {
    if (mM >= mA.size()) {
      mA.clear();
      mM = 0;
      do {
        final Z t = Z.valueOf(++mN).pow(3);
        Z kb;
        for (long k = 1; (kb = Binomial.binomial(k + 2, 3)).compareTo(t) <= 0; ++k) {
          final Z j3 = t.subtract(kb);
          final Z j = j3.root(3);
          if (j3.auxiliary() == 1) {
            mA.add(new Triple<>(mN, j.longValueExact(), k));
          }
        }
      } while (mA.isEmpty());
    }
    return Z.valueOf(select(mA.get(mM++)));
  }
}

