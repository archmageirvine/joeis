package irvine.oeis.a322;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a125.A125127;

/**
 * A322057 Array read by upwards antidiagonals: T(i,n) is the number of binary necklaces of length n that avoid 00...0 (i 0's).
 * @author Gregory Morse
 */
public class A322057 extends A125127 {
  @Override
  protected Z t(final int k, final int n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(lucas(k, n / d.intValueExact()).multiply(Functions.PHI.z(d)));
    }
    return sum.divide(n);
  }
}
