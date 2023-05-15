package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063792 Subtractive primes: p = x1x2x3..xk is a k-digit prime in base 10 such that abs(x1-x2-x3-...-xk) is also a prime.
 * @author Sean A. Irvine
 */
public class A063792 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z q = p;
      long s = 0;
      while (q.compareTo(Z.TEN) >= 0) {
        final Z[] qr = q.divideAndRemainder(Z.TEN);
        s += qr[1].longValue();
        q = qr[0];
      }
      if (q.subtract(s).abs().isProbablePrime()) {
        return p;
      }
    }
  }
}
