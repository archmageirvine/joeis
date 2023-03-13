package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061865 Triangle in which the k-th item in the n-th row (both starting from 1) is the number of ways in which we can add k distinct integers from 1 to n, in such a way that the sum is divisible by k.
 * @author Sean A. Irvine
 */
public class A061865 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int s, final int m, final int t) {
      if (n == 0) {
        return s == 0 && t == 0 ? Z.ONE : Z.ZERO;
      }
      final Z r = get(n - 1, s, m, t);
      return t == 0 ? r : r.add(get(n - 1, (s + n) % m, m, t - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, 0, mM, mM);
  }
}
