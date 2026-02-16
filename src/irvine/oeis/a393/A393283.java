package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393283 allocated for Benjamin W P Cornish.
 * @author Sean A. Irvine
 */
public class A393283 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n == 1) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, n - 1, i -> Integers.SINGLETON.sum(i * m / n, (i * m + n - 1) / n, j -> get(i, j)));
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
