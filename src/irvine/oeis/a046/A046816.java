package irvine.oeis.a046;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046816 Pascal's tetrahedron: entries in 3-dimensional version of Pascal triangle, or trinomial coefficients.
 * @author Sean A. Irvine
 */
public class A046816 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mK = -1;
  private int mI = 0;
  private int mJ = 0;

  @Override
  protected Z compute(final int i, final int j, final int k) {
    if (/* k < 0 || */ i < 0 || j < 0 || i > k || j > i) {
      return Z.ZERO;
    }
    if (i == 0 && j == 0 && k == 0) {
      return Z.ONE;
    }
    return get(i, j, k - 1).add(get(i - 1, j, k - 1)).add(get(i - 1, j - 1, k - 1));
  }

  @Override
  public Z next() {
    if (++mJ > mI) {
      if (++mI > mK) {
        ++mK;
        mI = 0;
      }
      mJ = 0;
    }
    return get(mI, mJ, mK);
  }
}
