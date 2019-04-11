package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008277 Triangle of Stirling numbers of the second kind, S2(n,k), <code>n &gt;= 1, 1 &lt;= k &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A008277 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Stirling.secondKind(mN, mM);
  }
}

