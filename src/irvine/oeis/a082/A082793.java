package irvine.oeis.a082;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082793 A tribonacci triangle in which the top two northeast and southeast diagonals consist of tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A082793 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      if (n <= 1) {
        return Z.ONE;
      }
      if (n == m) {
        return get(n - 1, n - 1).add(get(n - 2, n - 2)).add(get(n - 3, n - 3));
      }
      return get(n - 1, m).add(get(n - 2, m)).add(get(n - 3, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
