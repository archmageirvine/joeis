package irvine.oeis.a264;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A264008 Index of the smallest Fibonacci number divisible by prime(n)^2.
 * @author Sean A. Irvine
 */
public class A264008 extends A000040 {

  @Override
  public Z next() {
    final long p2 = super.next().square().longValueExact();
    long n = 2;
    long a = 1;
    long b = 1;
    while (true) {
      ++n;
      final long t = (a + b) % p2;
      if (t == 0) {
        return Z.valueOf(n);
      }
      a = b;
      b = t;
    }
  }
}

