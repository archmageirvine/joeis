package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A008299 Triangle T(n,k) of associated Stirling numbers of second kind, n &gt;= 2, 1 &lt;= k &lt;= floor(n/2).
 * @author Sean A. Irvine
 */
public class A008299 extends Sequence2 {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 1;
    }
    return Stirling.associatedSecondKind(2, mN, mM);
  }
}
