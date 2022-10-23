package irvine.oeis.a028;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028421 Triangle read by rows: T(n, k) = (k+1)*A132393(n+1, k+1), for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A028421 extends Sequence0 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Stirling.firstKind(mN, mM).abs().multiply(mM);
  }
}
