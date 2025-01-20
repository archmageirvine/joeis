package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074268 Primes of the form p^2 - p + 1 where p is prime.
 * @author Sean A. Irvine
 */
public class A074268 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      final Z p = q.square().subtract(q).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
