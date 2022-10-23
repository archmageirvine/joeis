package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050296 Maximum cardinality of a strongly triple-free subset of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A050296 extends Sequence1 {

  // After Steven Finch

  private static final CR LOG2 = CR.TWO.log();
  private static final CR LOG3 = CR.THREE.log();
  private long mN = 0;

  private long e(final long m) {
    return (m & 1) == 0 ? 3 * m - 1 : 3 * m - 2;
  }

  private long f(final long k, final long n, final long m) {
    return 1 + CR.valueOf(new Q(Z.valueOf(n), Z.THREE.pow(k)).divide(e(m))).log().divide(LOG2).floor().longValueExact();
  }

  private long g(final long n, final long m) {
    return CR.valueOf(new Q(n, e(m))).log().divide(LOG3).floor().longValueExact();
  }

  private Z pEven(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = 0; k <= g(n, m); ++k) {
      sum = sum.add((f(k, n, m) + ((k + 1) & 1)) / 2);
    }
    return sum;
  }

  private Z pOdd(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = 0; k <= g(n, m); ++k) {
      sum = sum.add((f(k, n, m) + (k & 1)) / 2);
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 1; m <= (mN + 2) / 3; ++m) {
      sum = sum.add(pEven(mN, m).max(pOdd(mN, m)));
    }
    return sum;
  }
}
