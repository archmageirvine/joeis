package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047858 T(n, k) = 2^(k-1)*(k + 2*n) - n + 1, array read by descending antidiagonals.
 * @author Sean A. Irvine
 */
public class A047858 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Z.valueOf(m + 2L * n).shiftLeft(m - 1).subtract(n - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

