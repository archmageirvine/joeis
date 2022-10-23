package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048472 Array T by antidiagonals, T(k,n)=(k+1)*n*2^(n-1)+1, n &gt;= 0, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A048472 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Z.valueOf(m + 1).multiply(n).shiftLeft(n - 1).add(1);
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
