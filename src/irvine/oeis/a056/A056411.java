package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056411 Number of step cyclic shifted sequences using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056411 extends Sequence1 {

  // After Joerg Arndt

  private long mN = 0;

  private long m(final long j, final long l) {
    long m = 1;
    long s = 0;
    long k = 1;
    while ((s += k) % l != 0) {
      k *= j;
      k %= l;
      ++m;
    }
    return m;
  }

  private long c(final long j, final long t, final long n) {
    Q s = Q.ZERO;
    for (long u = 0; u < n; ++u) {
      s = s.add(new Q(1, m(j, n / Functions.GCD.l(n, u * (j - 1) + t))));
    }
    return s.toZ().longValueExact();
  }

  protected Z cb(final long n, final long k) {
    if (n == 1) {
      return Z.valueOf(k);
    }
    Z sum = Z.ZERO;
    for (long t = 0; t < n; ++t) {
      for (long j = 1; j < n; ++j) {
        if (Functions.GCD.l(n, j) == 1) {
          sum = sum.add(Z.valueOf(k).pow(c(j, t, n)));
        }
      }
    }
    return sum.divide(n).divide(Functions.PHI.l(n));
  }

  @Override
  public Z next() {
    return cb(++mN, 3);
  }
}
