package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002618;

/**
 * A046062 Primes of the form n*phi(n)+1 where phi(n) is the Euler function.
 * @author Sean A. Irvine
 */
public class A046062 extends A002618 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
