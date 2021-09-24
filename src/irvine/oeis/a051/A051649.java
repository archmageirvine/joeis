package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051649 Primes of the form 2310*p + 1 where p is a prime.
 * @author Sean A. Irvine
 */
public class A051649 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply(2310).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
