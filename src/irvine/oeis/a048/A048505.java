package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048505 Array T read by diagonals, n-th difference of (T(k,n),T(k,n-1),...,T(k,0)) is (k+n)^2, for n=1,2,3,...; k=0,1,2,...
 * @author Sean A. Irvine
 */
public class A048505 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Z.valueOf(n * (long) n + (4L * m + 1) * n + 4L * m * m).shiftLeft(n - 2).subtract(m * (long) m - 1L);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
