package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047858 Array T read by diagonals; n-th difference of (T(k,n),T(k,n-1),...,T(k,0)) is k+n, for n=1,2,3,...; k=0,1,2,...
 * @author Sean A. Irvine
 */
public class A047858 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Z.valueOf(m + 2 * n).shiftLeft(m - 1).subtract(n - 1);
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

