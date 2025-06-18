package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078122 Infinite lower triangular matrix, M, that satisfies [M^3](i,j) = M(i+1,j+1) for all i,j&gt;=0 where [M^n](i,j) denotes the element at row i, column j, of the n-th power of matrix M, with M(0,k)=1 and M(k,k)=1 for all k&gt;=0.
 * @author Sean A. Irvine
 */
public class A078122 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mS = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return Integers.SINGLETON.sum(0, n, k -> mB.get(n, k).multiply(mB.get(k, m)));
    }
  };
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 0 || m == n ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> mS.get(n - 1, k).multiply(get(k, m - 1)));
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

