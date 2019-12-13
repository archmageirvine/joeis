package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027935 Triangular array T read by rows: <code>T(n,k)=t(n,2k)</code>, t given by <code>A027926; 0 &lt;= k &lt;=</code> n, <code>n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A027935 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return A027926.t(mN, 2 * mM);
  }

}
