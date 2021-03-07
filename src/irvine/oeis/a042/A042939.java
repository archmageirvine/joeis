package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A042939 Absolute values between digits of primes.
 * @author Sean A. Irvine
 */
public class A042939 extends A000040 {

  @Override
  public Z next() {
    Z[] qr =super.next().divideAndRemainder(Z.TEN);
    long s = -qr[1].longValue();
    while (!qr[0].isZero()) {
      qr = qr[0].divideAndRemainder(Z.TEN);
      if (qr[0].isZero()) {
        s += qr[1].longValue();
      } else {
        s -= qr[1].longValue();
      }
    }
    return Z.valueOf(Math.abs(s));
  }
}
