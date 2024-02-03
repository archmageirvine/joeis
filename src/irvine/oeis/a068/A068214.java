package irvine.oeis.a068;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068214 extends Sequence0 {

  // See https://en.wikipedia.org/wiki/Borwein_integral

  private int mN = -1;

  private long epsilon(long gamma, final int n) {
    long eps = 1;
    for (int k = 0; k < n; ++k) {
      if ((gamma & 1) == 1) {
        eps = -eps;
      }
      gamma >>>= 1;
    }
    return eps;
  }

  private Q a(final int n) {
    return new Q(1, 2L * n + 1);
  }

  private Q b(long gamma, final int n) {
    Q sum = a(0);
    for (int k = 1; k <= n; ++k) {
      sum = sum.signedAdd((gamma & 1) == 0, a(k));
      gamma >>>= 1;
    }
    return sum;
  }

  private Q sum(final int n) {
    Q sum = Q.ZERO;
    for (long gamma = 0; gamma < 1L << n; ++gamma) {
      final Q b = b(gamma, n);
      sum = sum.signedAdd(epsilon(gamma, n) > 0, b.pow(n).multiply(b.signum()));
    }
    return sum;
  }

  private Q den(final int n) {
    Q prod = a(0);
    for (int k = 1; k <= n; ++k) {
      prod = prod.multiply(a(k));
    }
    return prod.multiply(MemoryFactorial.SINGLETON.factorial(n)).multiply(Z.ONE.shiftLeft(n));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return select(sum(mN).divide(den(mN)));
  }
}

