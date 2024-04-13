package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058370 Primes p such that p and p^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A058370 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.DIGIT_SUM.l(p) == Functions.DIGIT_SUM.l(p.square())) {
        return p;
      }
    }
  }
}
