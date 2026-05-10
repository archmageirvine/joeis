package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084783 Triangle, read by rows, such that the diagonal (A084785) is the self-convolution of the first column (A084784) and the row sums (A084786) gives the differences of the diagonal and the first column.
 * @author Sean A. Irvine
 */
public class A084783 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return Z.ONE.add(Integers.SINGLETON.sum(1, n - 1, j -> get(j, 0).multiply(Binomial.binomial(n, j).subtract(get(n - j, 0)))));
      }
      return get(n, k - 1).add(get(n - 1, k - 1));
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
