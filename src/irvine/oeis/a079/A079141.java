package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079141 Primes of the form p^2 + 6 where p is prime.
 * @author Sean A. Irvine
 */
public class A079141 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().square().add(6);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

