package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054423 Number of unlabeled 3-gonal cacti having n triangles.
 * @author Sean A. Irvine
 */
public class A054423 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> Binomial.binomial(3L * d, d).multiply(Euler.phiAsLong(mN / d)))
      .add(Integers.SINGLETON.sumdiv(IntegerUtils.gcd(mN - 1, 3), d -> Binomial.binomial(3L * mN / d, (mN - 1) / d).multiply(Euler.phiAsLong((long) d)))).divide(3L * mN)
      .subtract(Binomial.binomial(3L * mN, mN).divide(2L * mN + 1));
  }
}
