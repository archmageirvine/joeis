package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000396;

/**
 * A061644 "Right perfect numbers": primes of the form 1 + a perfect number.
 * @author Sean A. Irvine
 */
public class A061644 extends A000396 {

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

