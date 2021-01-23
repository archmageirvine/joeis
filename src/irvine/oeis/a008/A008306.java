package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008306 Triangle T(n,k) read by rows: associated Stirling numbers of first kind (n &gt;= 2, 1 &lt;= k &lt;= floor(n/2)).
 * @author Sean A. Irvine
 */
public class A008306 implements Sequence {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 1;
    }
    return Stirling.associatedFirstKind(mN, mM);
  }
}


