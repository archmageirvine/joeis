package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071407 Least k such that k*prime(n) + 1 and k*prime(n) - 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A071407 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    while (true) {
      k += 2;
      final Z kp = p.multiply(k);
      if (kp.subtract(1).isProbablePrime() && kp.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
