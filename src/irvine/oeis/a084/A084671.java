package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084671 Primes such that the decimal concatenation of prime(n) and n is prime.
 * @author Sean A. Irvine
 */
public class A084671 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (new Z(p.toString() + ++mN).isProbablePrime()) {
        return p;
      }
    }
  }
}
