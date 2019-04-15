package irvine.oeis.a093;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A093729 Square table T, read by antidiagonals, where <code>T(n,k)</code> gives the number of n-th generation descendents of a node labeled <code>(k)</code> in the tree of tournament sequences.
 * @author Sean A. Irvine
 */
public class A093729 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    if (k == 0) {
      return Z.ZERO;
    }
    if (k <= n) {
      return get(n, k - 1).subtract(get(n - 1, k)).add(get(n - 1, 2 * k - 1)).add(get(n - 1, 2 * k));
    }
    Z sum = Z.ZERO;
    for (long j = 1; j <= n + 1; ++j) {
      sum = sum.signedAdd((j & 1) != 0, Binomial.binomial(n + 1, j).multiply(get(n, k - j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}
