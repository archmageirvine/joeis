package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030992 7-automorphic numbers ending in <code>8</code>: final digits of <code>7n^2</code> agree with <code>n</code>.
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
