package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027935 Triangular array T read by rows: T(n,k)=t(n,2k), t given by A027926; 0 &lt;= k &lt;= n, n &gt;= 0.
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
