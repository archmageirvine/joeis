package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389048 Decimal expansion of (sqrt((58+41 * sqrt(2)) * (5+2 * sqrt(5))) * Gamma(1/4)^4 * sin(Pi / 8)^4) / (5^(3/4) * Pi^3).
 * @author Sean A. Irvine
 */
public class A389048 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389048() {
    super(1, CR.SQRT2.divide(6400).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
