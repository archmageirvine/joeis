package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059594 Convolution triangle based on A008619 (positive integers repeated).
 * @author Sean A. Irvine
 */
public class A059594 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m).add(get(n - 1, m - 1)).add(get(n - 2, m)).subtract(get(n - 3, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
