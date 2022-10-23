package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002514 Coefficients in the asymptotic expansions of modified Hankel functions h_1(z) and h_2(z), rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A002514 extends Sequence1 {

  private Q mA = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(Z.valueOf(2 * mN - 1).square().multiply(9).subtract(4)).divide(mN).divide(48);
    return mA.add(Q.HALF).toZ();
  }
}
