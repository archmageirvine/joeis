package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071337.
 * @author Sean A. Irvine
 */
public class A071920 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return n == 0 ? Z.ZERO : Integers.SINGLETON.sum(0, m - 1, k -> Binomial.binomial(n + 2L * k - 1, 2L * k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

