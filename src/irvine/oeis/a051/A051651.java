package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051651 Primes of the form 30030*p + 1 where p is a prime.
 * @author Sean A. Irvine
 */
public class A051651 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply(30030).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
