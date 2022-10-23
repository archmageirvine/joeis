package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027948 Triangular array T read by rows: T(n,k) = t(n,2k+1) for 0 &lt;= k &lt;= n, T(n,n)=1, t given by A027926, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A027948 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == mN ? Z.ONE : A027926.t(mN, 2 * mM + 1);
  }

}
