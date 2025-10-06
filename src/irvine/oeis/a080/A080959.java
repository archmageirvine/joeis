package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080959 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(1, m, k -> Functions.FACTORIAL.z(m).multiply(Binomial.binomial(n + k, k)).divide(k).multiply(Z.NEG_ONE.pow(k + 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM, mM);
  }
}

