package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031882 Repdigital lucky numbers.
 * @author Sean A. Irvine
 */
public class A031882 extends A000959 {

  private boolean isRepDigit(final Z t) {
    final Z[] t0 = t.divideAndRemainder(Z.TEN);
    final Z r = t0[1];
    Z q = t0[0];
    while (!q.isZero()) {
      final Z[] qr = q.divideAndRemainder(Z.TEN);
      if (!r.equals(qr[1])) {
        return false;
      }
      q = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (isRepDigit(t)) {
        return t;
      }
    }
  }
}
