package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072701.
 * @author Sean A. Irvine
 */
public class A072829 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  private Q prod(final long n, final long m) {
    Q prod = Q.ONE;
    for (long k = 1; k < n; ++k) {
      prod = prod.multiply(new Q(m - k, m));
    }
    return prod;
  }

  @Override
  public Z next() {
    ++mN;
    while (prod(mN, mM).compareTo(Q.HALF) <= 0) {
      ++mM;
    }
    return Z.valueOf(mM - 1);
  }
}
