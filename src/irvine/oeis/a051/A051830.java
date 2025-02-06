package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051830 a(n) = Fibonacci(p(n)+1) mod p(n), where p(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A051830 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long a = 0;
    long b = 1;
    for (long k = 0; k < p; ++k) {
      final long t = (a + b) % p;
      a = b;
      b = t;
    }
    return Z.valueOf(b);
  }
}
