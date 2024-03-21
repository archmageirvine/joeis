package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068881 Largest n-digit square with property that digits alternate in parity, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068881 extends Sequence1 {

  private Z mA = Z.ZERO;

  private boolean is(Z s) {
    boolean parity = s.isOdd();
    s = s.divide(10);
    while (!s.isZero()) {
      if (s.isOdd() == parity) {
        return false;
      }
      parity = !parity;
      s = s.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mA.isEven() ? 9 : 8);
    Z r = mA.sqrt().add(1);
    while (true) {
      final Z s = r.square();
      if (s.compareTo(mA) <= 0 && is(s)) {
        return s;
      }
      r = r.subtract(1);
    }
  }
}
