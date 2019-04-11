package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A018239 Primorial primes: form product of first k primes and add <code>1,</code> then reject unless prime.
 * @author Sean A. Irvine
 */
public class A018239 extends A006862 {

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

