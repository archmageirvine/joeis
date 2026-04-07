package irvine.oeis.a147;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A147814 a(n) is the number of bits in the Elias omega-coded value of prime(n).
 * @author Sean A. Irvine
 */
public class A147814 extends A000040 {

  private long d(final long k, final long n) {
    return k == 0 ? Functions.DIGIT_LENGTH.l(2, n) : Functions.DIGIT_LENGTH.l(2, d(k - 1, n) - 1);
  }

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long sum = 2;
    long i = 0;
    while (true) {
      final long d = d(i, p);
      sum += d;
      if (d <= 2) {
        return Z.valueOf(sum);
      }
      ++i;
    }
  }
}
