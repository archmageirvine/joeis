package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048969 Composite numbers k such that sigma(k) / d(k) is prime.
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

