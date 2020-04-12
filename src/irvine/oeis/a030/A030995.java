package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030995 9-automorphic numbers ending in <code>5</code>: final digits of <code>9*n^2</code> agree with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A030995 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    final Z t = Z.ONE.shiftLeft(mN);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.NINE.modInverse(t), Z.ZERO}, new Z[] {t, mF});
  }
}
