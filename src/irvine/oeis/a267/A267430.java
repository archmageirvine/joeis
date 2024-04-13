package irvine.oeis.a267;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A267430 Squares whose digit sum is not a prime.
 * @author Georg Fischer
 */
public class A267430 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (!Functions.DIGIT_SUM.z(result).isPrime()) {
        return result;
      }
    }
  }
}
