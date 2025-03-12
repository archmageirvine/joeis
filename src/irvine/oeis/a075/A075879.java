package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075879 The (10^n)-th odd-digit number.
 * @author Sean A. Irvine
 */
public class A075879 extends Sequence1 {

  // After Alois P. Heinz

  private Z mA = null;

  private Z b(final Z n) {
    Z m = n;
    StringBuilder r = new StringBuilder();
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(5);
      m = qr[0];
      long d = qr[1].longValue();
      if (d == 0) {
        d = 5;
        m = m.subtract(1);
      }
      r.insert(0, 2 * d - 1);
    }
    return new Z(r);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return b(mA);
  }
}
