package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388788 allocated for Natalia L. Skirrow.
 * @author Sean A. Irvine
 */
public class A388788 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, m, k -> Binomial.binomial(m - 1, k - 1).multiply(Functions.STIRLING1.z(n, k).abs()));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN - mM + 1);
  }
}

