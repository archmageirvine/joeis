package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048880 Primes of form pq+2 where p and q are consecutive primes.
 * @author Sean A. Irvine
 */
public class A048880 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      final Z r = mP.multiply(q).add(2);
      if (r.isProbablePrime()) {
        return r;
      }
    }
  }
}

