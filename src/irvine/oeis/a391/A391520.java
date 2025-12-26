package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391520 Square array T(n,k) read by ascending antidiagonals: T(n,k) = (p - 1)/2*(2*(n - 1)*p^(n - 1) - (2*n - 3)*p^(n - 2)), n&gt;=2, where p is the k-th odd prime.
 * @author Sean A. Irvine
 */
public class A391520 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final Z p = Functions.PRIME.z(m + 1);
    return p.subtract(1).divide2().multiply(p.pow(n - 1).multiply(2 * n - 2).subtract(p.pow(n - 2).multiply(2 * n - 3)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 2, mM + 1);
  }
}
