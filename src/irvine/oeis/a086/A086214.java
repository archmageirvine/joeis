package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086214 Primes of the form 3^p-2 where p is prime.
 * @author Sean A. Irvine
 */
public class A086214 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.THREE.pow(super.next()).subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
