package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048969 Numbers n such that n is composite and sigma(n) / d(n) is prime.
 * @author Sean A. Irvine
 */
public class A048969 extends A048968 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}

