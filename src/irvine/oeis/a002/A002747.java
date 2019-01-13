package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002747.
 * @author Sean A. Irvine
 */
public class A002747 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      final Z t = mA.multiply(mN - 1).signedAdd((mN & 1) == 1, Z.ONE).multiply(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
