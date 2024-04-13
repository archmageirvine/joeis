package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A046713 Multiplicative and additive primes: primes where the product and sum of digits are also prime.
 * @author Sean A. Irvine
 */
public class A046713 extends A046703 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.valueOf(Functions.DIGIT_SUM.l(p)).isProbablePrime()) {
        return p;
      }
    }
  }
}
