package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.LnGamma;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A030169.
 * @author Sean A. Irvine
 */
public class A030169 extends DecimalExpansionSequence {

  private static final UnaryCRFunction PSI = new LnGamma().monotoneDerivative(CR.HALF, CR.FOUR);
  private static final CR N = PSI.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}
