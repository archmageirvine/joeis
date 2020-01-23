package irvine.oeis.a028;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028421 Triangle read by rows: <code>f(n, k) = (k+1)*A132393(n+1, k+1)</code>, for <code>n &gt;= 0, k = 0, 1</code>, ..., <code>n</code>.
 * @author Sean A. Irvine
 */
public class A028421 implements Sequence {

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
