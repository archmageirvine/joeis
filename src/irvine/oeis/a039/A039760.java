package irvine.oeis.a039;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039760 Triangle of D-analogs of Stirling numbers of the 2nd kind.
 * @author Sean A. Irvine
 */
public class A039760 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = m; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Stirling.secondKind(k, m)).shiftLeft(k - m));
    }
    return sum.subtract(Stirling.secondKind(n - 1, m).multiply(n).shiftLeft(n - 1 - m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

