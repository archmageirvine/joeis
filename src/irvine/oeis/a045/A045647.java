package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045647 Numbers n such that n! stripped of trailing zeros ends in n.
 * @author Sean A. Irvine
 */
public class A045647 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;
  private long mT = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mT) {
        mT *= 10;
      }
      mF = mF.multiply(mN);
      while (true) {
        final Z[] qr = mF.divideAndRemainder(Z.TEN);
        if (Z.ZERO.equals(qr[1])) {
          mF = qr[0];
        } else {
          break;
        }
      }
      if (mF.mod(mT) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
