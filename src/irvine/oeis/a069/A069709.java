package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069709 Primes with arithmetic mean of digits an integer (sum of digits = a multiple of number of digits).
 * @author Sean A. Irvine
 */
public class A069709 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.DIGIT_SUM.l(p) % Functions.DIGIT_LENGTH.l(p) == 0) {
        return p;
      }
    }
  }
}
