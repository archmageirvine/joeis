package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051646 Primes of the form 30*p + 1 where p is also prime.
 * @author Sean A. Irvine
 */
public class A051646 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply(30).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
