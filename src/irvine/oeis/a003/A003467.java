package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A003467 Number of minimal covers of an n-set that cover exactly 3 points uniquely.
 * @author Sean A. Irvine
 */
public class A003467 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.FIVE;
    }
    return Binomial.binomial(mN, 3).multiply(Z.ONE.shiftLeft(2L * mN - 6).add(3));
  }
}
