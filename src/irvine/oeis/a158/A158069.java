package irvine.oeis.a158;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A158069 Primes p such that sum of digits of p - first digit of p is not prime.
 * @author Georg Fischer
 */
public class A158069 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Z.valueOf(Functions.DIGIT_SUM.l(p) - p.toString().charAt(0) + '0').isPrime()) {
        return p;
      }
    }
  }
}
