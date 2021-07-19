package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.LnGamma;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A030171 Decimal expansion of real number y such that y = Gamma(x) is a minimum.
 * @author Sean A. Irvine
 */
public class A030171 extends DecimalExpansionSequence {

  // Slow.

  private static final UnaryCRFunction PSI = new LnGamma().monotoneDerivative(CR.HALF, CR.FOUR);

  /** Construct the sequence. */
  public A030171() {
    super(PSI.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO).lnGamma().exp());
  }
}
