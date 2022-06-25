package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057678 Primes of the form 2^p - p where p is prime.
 * @author Sean A. Irvine
 */
public class A057678 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = Z.ONE.shiftLeft(p.intValueExact()).subtract(p);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
