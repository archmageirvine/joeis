package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068961 Powers of 2 with exactly two 2's in their decimal digits.
 * @author Sean A. Irvine
 */
public class A068961 extends Sequence1 {

  private Z mA = Z.ONE;

  private boolean is(Z n) {
    int twos = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].equals(Z.TWO) && ++twos > 2) {
        return false;
      }
      n = qr[0];
    }
    return twos == 2;
  }

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(2);
      if (is(mA)) {
        return mA;
      }
    }
  }
}
