package irvine.oeis.a070;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070044.
 * @author Sean A. Irvine
 */
public class A070051 extends Sequence1 {

  private final int mP;
  private int mN = 0;

  protected A070051(final int p) {
    mP = p;
  }

  /** Construct the sequence. */
  public A070051() {
    this(3);
  }

  private final MemoryFunctionInt3<Z> mT = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int p, final int n, final int k) {
      if (p == 1) {
        if (k == 1) {
          return Z.ONE;
        }
        if (k > 1) {
          return Z.ZERO;
        }
      }
      Z sum = Z.ZERO;
      for (int j = k; j <= n; ++j) {
        for (int i = 1; i <= k; ++i) {
          sum = sum.add(get(p - 1, j, i));
        }
      }
      return sum;
    }
  };

  private Z k(final int p, final int n) {
    return Integers.SINGLETON.sum(1, n, k -> mT.get(p, n, k));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      for (int j = 1; j <= mP; ++j) {
        sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(mP, j)).multiply(k(j, k)));
      }
    }
    return sum;
  }
}
