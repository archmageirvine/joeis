package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061412 Numbers k such that m*2^k + 1 is prime for exactly one coefficient m in the range 0 &lt;= m &lt;= k.
 * @author Sean A. Irvine
 */
public class A061412 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int n) {
    boolean sawPrime = false;
    for (int m = 1; m <= n; ++m) {
      if (Z.valueOf(m).shiftLeft(n).add(1).isProbablePrime()) {
        if (sawPrime) {
          return false;
        }
        sawPrime = true;
      }
    }
    return sawPrime;
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

