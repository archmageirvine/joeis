package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051648 Primes of form 210*p + 1 where p is a prime.
 * @author Sean A. Irvine
 */
public class A051648 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply(210).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
