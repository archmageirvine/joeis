package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030991 7-automorphic numbers ending in <code>5</code>: final digits of <code>7n^2</code> agree with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A030991 implements Sequence {

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
