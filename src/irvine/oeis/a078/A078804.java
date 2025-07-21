package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078804 Triangular array T given by T(n,k)= number of 01-words of length n having exactly k 1's and every runlength of 1's odd.
 * @author Sean A. Irvine
 */
public class A078804 extends Sequence1 {

  private int mN = 1;
  private int mM = 1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m >= n) {
        return Z.ZERO;
      }
      if (m == 0) {
        return Z.ONE;
      }
      if (m == 1) {
        return Z.valueOf(n - 1);
      }
      if (n == 3) {
        return Z.ZERO;
      }
      if (n == 4) {
        return Z.ONE;
      }
      return get(n - 2, m).add(get(n - 2, m - 1)).add(get(n - 2, m - 2)).add(get(n - 3, m - 1)).subtract(get(n - 4, m - 2));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
