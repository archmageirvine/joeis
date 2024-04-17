package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046506 Primes with multiplicative persistence value 6.
 * @author Sean A. Irvine
 */
public class A046506 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(p) == 6) {
        return p;
      }
    }
  }
}
