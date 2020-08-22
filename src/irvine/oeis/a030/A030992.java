package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030992 7-automorphic numbers ending in 8: final digits of 7n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030992 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.SEVEN.modInverse(mF)}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
