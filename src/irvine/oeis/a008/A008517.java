package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008517 Second-order Eulerian triangle T(n,k), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A008517 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.EULERIAN2.z(mN, mM);
  }
}

