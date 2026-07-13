package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085830 Least number k such that (10^n)^k &lt; k!.
 * @author Sean A. Irvine
 */
public class A085830 extends Sequence0 {

  // After Robert G. Wilson v

  private static final CR LOG_10 = CR.TEN.log();
  private static final CR HALF_LOG_2PI = CR.TAU.log().divide(CR.TWO);

  private int mN = -1;
  private Z mK = Z.ONE;

  /**
   * Stirling approximation to log(k!) in base 10^n.
   */
  private CR logFactorial(final Z k, final int n) {
    final CR x = CR.valueOf(k);
    final CR x2 = x.square();
    final CR x3 = x2.multiply(x);
    final CR x4 = x2.square();
    final CR x5 = x4.multiply(x);
    final CR corr = CR.ONE
        .add(CR.ONE.divide(x.multiply(12)))
        .add(CR.ONE.divide(x2.multiply(288)))
        .subtract(CR.valueOf(139).divide(x3.multiply(51840)))
        .subtract(CR.valueOf(571).divide(x4.multiply(2488320)))
        .add(CR.valueOf(163879).divide(x5.multiply(209018880)));
    final CR logFact = HALF_LOG_2PI
        .add(x.log().divide(CR.TWO))
        .add(x.multiply(x.divide(CR.E).log()))
        .add(corr.log());
    return logFact.divide(LOG_10.multiply(CR.valueOf(n)));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mK = Z.TWO;
      return mK;
    }
    mK = mK.multiply(10);
    while (logFactorial(mK, mN).compareTo(CR.valueOf(mK)) <= 0) {
      mK = mK.add(1);
    }
    return mK;
  }
}
