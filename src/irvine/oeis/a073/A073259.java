package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073259 Number of iterations of f(n,k) = n+pi(k)+1 starting from f(n,n) until a fixed point is reached.
 * @author Sean A. Irvine
 */
public class A073259 extends Sequence1 {

  private long mN = 0;

  private long f(final long n, final long m) {
    return n + Functions.PRIME_PI.l(m) + 1;
  }

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    long cnt = 0;
    while (true) {
      final long t = m;
      m = f(mN, m);
      ++cnt;
      if (t == m) {
        return Z.valueOf(cnt);
      }
    }
  }
}

