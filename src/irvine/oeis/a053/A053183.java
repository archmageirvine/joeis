package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053183 Primes of the form p^2 + p + 1 when p is prime.
 * @author Sean A. Irvine
 */
public class A053183 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.square().add(p).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

