package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027948 Triangular array T read by rows: <code>T(n,k) = t(n,2k+1)</code> for <code>0 &lt;= k &lt;=</code> n, <code>T(n,n)=1</code>, t given by <code>A027926, n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A027948 implements Sequence {

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
