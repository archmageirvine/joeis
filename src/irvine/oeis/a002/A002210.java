package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002210.
 * @author Sean A. Irvine
 */
public class A002210 extends DecimalExpansionSequence {

  private static final CR LN2 = CR.TWO.log();

  private CR mS1 = Zeta.zeta(2).subtract(CR.ONE);
  private Q mS2 = Q.ONE;
  private int mN = 1;

  // Add another term into the approximation of the Khintchine constant.
  // Computed using ln K_0 = (1/ln(2)) * sum_{n=1}^\infty {(\zeta(2n)-1)/(n)} * sum_{k=1}^{2n-1} (-)^{k+1}/k
  private void step() {
    ++mN;
    mS2 = mS2.add(new Q(Z.ONE, Z.TWO.multiply(1 - mN).multiply(2 * mN - 1)));
    mS1 = mS1.add(Zeta.zeta(2 * mN).subtract(CR.ONE).multiply(CR.valueOf(mS2.divide(mN))));
  }

  @Override
  protected void ensureAccuracy(final int n) {
    // The constant 2 below is good for at least 348 terms of this sequence
    // A larger number will accumulate greater accuracy but takes longer
    while (mN < 2 * n) {
      step();
    }
  }

  @Override
  protected CR getCR() {
    return mS1.divide(LN2).exp();
  }
}
