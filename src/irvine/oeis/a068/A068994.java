package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068994 Powers of 2 with all even digits.
 * @author Sean A. Irvine
 */
public class A068994 extends Sequence1 {

  private Z mA = Z.ONE;

  private boolean is(Z n) {
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].isOdd()) {
        return false;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply2();
      if (is(mA)) {
        return mA;
      }
    }
  }
}
