package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389042 Decimal expansion of (8192 * sqrt(2+sqrt(2)) * (2+sqrt(5)) * Gamma(9/4)^4) / (3125 * Pi^3).
 * @author Sean A. Irvine
 */
public class A389042 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389042() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4).divide(8000).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt()).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
