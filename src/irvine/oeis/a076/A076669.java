package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a053.A053191;

/**
 * A076669 Primes of the form n^2*totient(n)+1 (or A053191(n) + 1).
 * @author Sean A. Irvine
 */
public class A076669 extends A053191 {

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
