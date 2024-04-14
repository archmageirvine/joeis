package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a034.A034895;

/**
 * A055604 Primes such that (a) reversal of digits gives a prime, (b) deleting any digit gives a prime and (c) reversing digits and deleting any digit gives a prime.
 * @author Sean A. Irvine
 */
public class A055604 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A034895.is(p)) {
        final Z pr = Functions.REVERSE.z(p);
        if (pr.isProbablePrime() && A034895.is(pr)) {
          return p;
        }
      }
    }
  }
}
