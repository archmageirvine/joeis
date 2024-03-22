package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068880 Smallest n-digit square with property that digits alternate in parity.
 * @author Sean A. Irvine
 */
public class A068880 extends Sequence1 {

  private Z mA = Z.ZERO;

  static boolean is(Z s) {
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
    mA = mA.multiply(10).add(mA.isEven() ? 1 : 0);
    Z r = mA.sqrt();
    while (true) {
      final Z s = r.square();
      if (s.compareTo(mA) >= 0 && is(s)) {
        return s;
      }
      r = r.add(1);
    }
  }
}
