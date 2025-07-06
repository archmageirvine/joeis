package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078597 Primes of the form p*(p+4)+2 where p and p+4 are primes.
 * @author Sean A. Irvine
 */
public class A078597 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p4 = p.add(4);
      if (p4.isProbablePrime()) {
        final Z q = p4.multiply(p).add(2);
        if (q.isProbablePrime()) {
          return q;
        }
      }
    }
  }
}

