package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051834 Fibonacci(Pn-1) mod Pn, where Pn is the n-th prime.
 * @author Sean A. Irvine
 */
public class A051834 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long a = 0;
    long b = 1;
    for (long k = 2; k < p; ++k) {
      final long t = (a + b) % p;
      a = b;
      b = t;
    }
    return Z.valueOf(b);
  }
}
