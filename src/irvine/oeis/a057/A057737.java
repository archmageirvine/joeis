package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057737 Primes of the form 2^p + 3, where p is prime.
 * @author Sean A. Irvine
 */
public class A057737 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z q = Z.ONE.shiftLeft(super.next().intValueExact()).add(3);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
