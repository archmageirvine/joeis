package irvine.oeis.a211;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A211270 Number of integer pairs (x,y) such that 0 &lt; x &lt;= y &lt;= n and x*y = 2n.
 * a(n) = floor((A000005(2n)-1)/2).
 * @author Georg Fischer
 */
public class A211270 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA0.z(mN << 1).subtract(1).divide2();
  }
}
