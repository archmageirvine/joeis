package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a042.A042947;

/**
 * A046850 Gilda's primes: primes in A042947.
 * @author Sean A. Irvine
 */
public class A046850 extends A042947 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
