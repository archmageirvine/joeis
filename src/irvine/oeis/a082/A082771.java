package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082771 Triangular array, read by rows: T(n,k) = Sum_{d|n} d^k, 0 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A082771 extends Sequence1 {

  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.SIGMA.z(mM, mN);
  }
}
