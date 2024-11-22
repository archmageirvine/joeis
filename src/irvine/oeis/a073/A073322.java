package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073322 extends A002808 {

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

