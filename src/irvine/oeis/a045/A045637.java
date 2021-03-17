package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045637 Primes of the form p^2 + 4, where p is prime.
 * @author Sean A. Irvine
 */
public class A045637 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.square().add(4);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
