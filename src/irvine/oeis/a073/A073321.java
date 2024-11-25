package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073321 a(n)=A073259[A000040(n)]; Length of FixedPointList started with n-th prime and leading to corresponding composite number.
 * @author Sean A. Irvine
 */
public class A073321 extends A000040 {

  private long f(final long n, final long m) {
    return n + Functions.PRIME_PI.l(m) + 1;
  }

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long m = p;
    long cnt = 0;
    while (true) {
      final long t = m;
      m = f(p, m);
      ++cnt;
      if (t == m) {
        return Z.valueOf(cnt);
      }
    }
  }
}

