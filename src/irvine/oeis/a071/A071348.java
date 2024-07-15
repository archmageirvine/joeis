package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a068.A068019;

/**
 * A068017 Composite n such that sigma(n) - 1 and sigma(n) + 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A071348 extends A068019 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z t = Functions.SIGMA1.z(c);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return c;
      }
    }
  }
}
