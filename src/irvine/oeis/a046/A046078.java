package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002618;

/**
 * A046078 Primes of the form n*phi(n)-1 where phi is the Euler function (in order of appearance).
 * @author Sean A. Irvine
 */
public class A046078 extends A002618 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
