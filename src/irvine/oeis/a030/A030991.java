package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A030991 7-automorphic numbers ending in 5: final digits of 7n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030991 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    final Z t = Z.ONE.shiftLeft(mN);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.SEVEN.modInverse(t), Z.ZERO}, new Z[] {t, mF});
  }
}
