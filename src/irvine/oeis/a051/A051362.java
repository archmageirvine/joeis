package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a034.A034895;

/**
 * A051362 Primes remaining prime if any digit is deleted (zeros allowed).
 * @author Sean A. Irvine
 */
public class A051362 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A034895.is(p)) {
        return p;
      }
    }
  }
}
