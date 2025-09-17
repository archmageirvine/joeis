package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388372 Decimal expansion of (1/20) * 5^(1/2) * sqrt(Pi) * sqrt(2) * (5-5^(1/2))^(1/2) * (5^(1/2)+1) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388372 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388372() {
    super(1, CR.FIVE.sqrt().divide(20).multiply(CR.SQRT_PI).multiply(CR.SQRT2).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).sqrt()).multiply(CR.FIVE.sqrt().add(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
