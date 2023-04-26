package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A063432 Triangle read by rows in which k-th entry in row n is representation of n in base k, for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A063432 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z value(final int n, final int b) {
    return new Z(b == 1 ? StringUtils.rep('1', n) : Long.toString(n, b));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return value(mN, mM);
  }
}
