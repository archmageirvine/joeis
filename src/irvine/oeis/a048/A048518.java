package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a031.A031955;

/**
 * A048518 Primes containing only two distinct digits whose sum of digits is 28, the second perfect number.
 * @author Sean A. Irvine
 */
public class A048518 extends A031955 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime() && Functions.DIGIT_SUM.l(t) == 28) {
        return t;
      }
    }
  }
}
