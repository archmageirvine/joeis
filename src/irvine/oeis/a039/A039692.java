package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039692 Jabotinsky-triangle related to A039647.
 * @author Sean A. Irvine
 */
public class A039692 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = m; k <= n; ++k) {
      sum = sum.signedAdd(((k + m) & 1) == 0,
        Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k)).multiply(Functions.STIRLING1.z(k, m)).multiply(Binomial.binomial(k, n - k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
