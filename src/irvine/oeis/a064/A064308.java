package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064308 Product of two triangular matrices C*S2.
 * @author Sean A. Irvine
 */
public class A064308 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z catalan(final int n, final int m) {
    return Binomial.binomial(n + m, n).multiply(n - m + 1).divide(n + 1);
  }

  protected Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(m, n, k -> catalan(n, k).multiply(Functions.STIRLING2.z(k, m)));
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
