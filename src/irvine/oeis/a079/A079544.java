package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A079544 Primes of the form x^2 + y^2 + 1, x&gt;0, y&gt;0.
 * @author Sean A. Irvine
 */
public class A079544 extends A000404 {

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

