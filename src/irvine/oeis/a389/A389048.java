package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389048 Decimal expansion of (1/6400) * sqrt(2) * 5^(3/4) * Gamma(5/8)^4 * (3+2 * sqrt(2)) * (5-5^(1/2))^(3/2) * (2+sqrt(2))^(1/2) * (5^(1/2)+1)^3 / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A389048 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389048() {
    super(1, CR.SQRT2.divide(6400).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
