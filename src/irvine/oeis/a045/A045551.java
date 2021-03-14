package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045551.
 * @author Sean A. Irvine
 */
public class A045551 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 1;

  protected long digits() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      while (true) {
        final Z[] qr = mF.divideAndRemainder(Z.TEN);
        if (Z.ZERO.equals(qr[1])) {
          mF = qr[0];
        } else {
          break;
        }
      }
      if (mF.mod(100) == digits()) {
        return Z.valueOf(mN);
      }
    }
  }
}
