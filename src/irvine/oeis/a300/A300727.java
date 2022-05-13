package irvine.oeis.a300;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A300727 Decimal expansion of the total harmonic distortion (THD) of the sawtooth signal filtered by a 2nd-order low-pass filter.
 * Formula: sqrt(Pi*(cot(Pi/sqrt(2))*coth(Pi/sqrt(2))^2-cot(Pi/sqrt(2))^2*coth(Pi/sqrt(2))-cot(Pi/sqrt(2))-coth(Pi/sqrt(2)))/((cot(Pi/sqrt(2))^2+coth(Pi/sqrt(2))^2)*sqrt(2))+(1/3)*Pi^2-1)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A300727 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR PI_DIV_SQRT2 = CR.PI.divide(CR.SQRT2);
  private static final CR COT_PI_DIV_SQRT2 = REALS.cot(PI_DIV_SQRT2);
  private static final CR COTH_PI_DIV_SQRT2 = REALS.coth(PI_DIV_SQRT2);
  private static final CR COT_PI_DIV_SQRT2_SQR = COT_PI_DIV_SQRT2.multiply(COT_PI_DIV_SQRT2);
  private static final CR COTH_PI_DIV_SQRT2_SQR = COTH_PI_DIV_SQRT2.multiply(COTH_PI_DIV_SQRT2);

  /** Construct the sequence. */
  public A300727() {
    super(0, CR.PI.multiply(COT_PI_DIV_SQRT2.multiply(COTH_PI_DIV_SQRT2_SQR).subtract(COT_PI_DIV_SQRT2_SQR.multiply(COTH_PI_DIV_SQRT2)).subtract(COT_PI_DIV_SQRT2).subtract(COTH_PI_DIV_SQRT2)).divide(COT_PI_DIV_SQRT2_SQR.add(COTH_PI_DIV_SQRT2_SQR).multiply(CR.SQRT2)).add(CR.ONE_THIRD.multiply(CR.PI.square())).subtract(CR.ONE).sqrt());
  }
}
