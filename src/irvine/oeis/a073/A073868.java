package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A073868 a(n) is the smallest composite number with the sum of digits = the n-th prime number.
 * @author Sean A. Irvine
 */
public class A073868 extends A000040 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    if (p <= 10) {
      // Direct search for small cases
      long k = 0;
      while (true) {
        if (!mPrime.isPrime(++k) && Functions.DIGIT_SUM.l(k) == p) {
          return Z.valueOf(k);
        }
      }
    }
    final int nines = p / 9;
    final int remaining = p % 9;
    final Z candidate = new Z(remaining + StringUtils.rep('9', nines));
    if (!candidate.isProbablePrime()) {
      return candidate;
    }
    // Try harder
    for (int r = remaining + 1, v = 8; r < 10; ++r, --v) {
      for (int k = 0; k < nines; ++k) {
        final Z c2 = new Z(r + StringUtils.rep('9', k) + v + StringUtils.rep('9', nines - 1 - k));
        if (!c2.isProbablePrime()) {
          return c2;
        }
      }
    }
    throw new RuntimeException();
  }
}
