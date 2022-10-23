package irvine.oeis.a048;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048994 Triangle of Stirling numbers of first kind, s(n,k), n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A048994 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Stirling.firstKind(mN, mM);
  }
}

