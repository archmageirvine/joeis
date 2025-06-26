package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.LnGamma;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A030169 Decimal expansion of the real positive number x such that Gamma(x) is a minimum.
 * @author Sean A. Irvine
 */
public class A030169 extends DecimalExpansionSequence {

  private static final UnaryCrFunction PSI = new LnGamma().monotoneDerivative(CR.HALF, CR.FOUR);

  /** Construct the sequence. */
  public A030169() {
    super(PSI.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}
