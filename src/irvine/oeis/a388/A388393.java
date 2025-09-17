package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388393 Decimal expansion of (1/800) * 5^(3/4) * sqrt(2 * Pi) * (5-5^(1/2))^(3/2) * (5^(1/2)+1)^3 / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388393 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388393() {
    super(1, CR.FIVE.pow(new Q(3, 4)).divide(800).multiply(CR.TAU.sqrt()).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
