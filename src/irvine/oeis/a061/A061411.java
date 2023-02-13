package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061411 Numbers k such that m*2^k - 1 is nonprime for all coefficients m in the range 0 &lt;= m &lt;= k.
 * @author Sean A. Irvine
 */
public class A061411 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int n) {
    for (int m = 1; m <= n; ++m) {
      if (Z.valueOf(m).shiftLeft(n).subtract(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

