package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054368 Number of unlabeled 6-gonal cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054368 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z a = Integers.SINGLETON.sumdiv(mN, d -> Binomial.binomial(6L * d, d).multiply(LongUtils.phi(mN / d)));
    final Z b = Integers.SINGLETON.sumdiv(IntegerUtils.gcd(mN - 1, 6), d -> Binomial.binomial(6L * mN / d, (mN - 1) / d).multiply(LongUtils.phi(d)));
    return a.add(b).divide(6L * mN).subtract(Binomial.binomial(6L * mN, mN).divide(5L * mN + 1));
  }
}
