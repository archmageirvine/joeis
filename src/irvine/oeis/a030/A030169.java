package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.LnGamma;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A030169 Decimal expansion of real number x such that y = Gamma(x) is a minimum.
 * @author Sean A. Irvine
 */
public class A030169 extends DecimalExpansionSequence {

  private static final UnaryCRFunction PSI = new LnGamma().monotoneDerivative(CR.HALF, CR.FOUR);

  /** Construct the sequence. */
  public A030169() {
    super(PSI.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}
