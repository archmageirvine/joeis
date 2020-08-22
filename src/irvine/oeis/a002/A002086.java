package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002086 Number of circulant tournaments on 2n+1 nodes up to Cayley isomorphism.
 * @author Sean A. Irvine
 */
public class A002086 implements Sequence {

  // After Andrew Howroyd

  private long mN = 0;

  private boolean isLeastPoint(final long s, final long k, final long n) {
    long t = (s * k) % n;
    while (t > s) {
      t = (t * k) % n;
    }
    return t == s;
  }

  private long c(final long n, final long k) {
    long c = 0;
    for (long u = 1; u < n; ++u) {
      if (isLeastPoint(u, k, n)) {
        ++c;
      }
    }
    return c / 2;
  }

  private boolean isC(final long n, final long k) {
    for (long u = 1; u < n; ++u) {
      if (isDirected(u, n - u, k, n)) {
        return false;
      }
    }
    return true;
  }

  private boolean isDirected(final long s, final long r, final long k, final long n) {
    long t = (s * k) % n;
    while (t != s && t != r) {
      t = (t * k) % n;
    }
    return t == r;
  }

  @Override
  public Z next() {
    final long m = 2 * ++mN + 1;
    Z sum = Z.ZERO;
    for (long k = 1; k <= m; ++k) {
      if (LongUtils.gcd(m, k) == 1 && isC(m, k)) {
        sum = sum.add(Z.ONE.shiftLeft((int) c(m, k)));
      }
    }
    return sum.divide(LongUtils.phi(m));
  }
}
