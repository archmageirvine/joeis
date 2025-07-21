package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078807 Triangular array T given by T(n,k) = number of 01-words of length n having exactly k 1's, all runlengths odd and first letter 0.
 * @author Sean A. Irvine
 */
public class A078807 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m >= n) {
        return Z.ZERO;
      }
      if (m == 0) {
        return Z.valueOf(n & 1);
      }
      Z sum = Z.ZERO;
      for (int k = 1; k < n; k += 2) {
        sum = sum.add(get(n - k, n - m - k));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
