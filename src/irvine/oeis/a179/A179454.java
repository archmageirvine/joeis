package irvine.oeis.a179;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A179454 Permutation trees of power n and height k.
 * @author Sean A. Irvine
 */
public class A179454 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int t, final int h) {
      if (n == 0 || h == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, j -> Binomial.binomial(n - 1, j - 1).multiply(get(j - 1, 0, h - 1)).multiply(get(n - j, t, h)));
    }
  };

  /**
   * Compute number of trees.
   * @param n power
   * @param m height
   * @return number of trees
   */
  public Z t(final int n, final int m) {
    final Z res = mB.get(n, 1, m - 1);
    return m < 2 ? res : res.subtract(mB.get(n, 1, m - 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = Math.min(mN, 1);
    }
    return t(mN, mM);
  }
}
