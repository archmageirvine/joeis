package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046502 Primes with multiplicative persistence value 2.
 * @author Sean A. Irvine
 */
public class A046502 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(p) == 2) {
        return p;
      }
    }
  }
}
