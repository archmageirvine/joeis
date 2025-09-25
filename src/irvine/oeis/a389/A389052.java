package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389052 Decimal expansion of (8 * sqrt(20+14 * sqrt(2)) * Gamma(5/4)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A389052 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389052() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4).divide(-16).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).divide(CR.SQRT2.subtract(2)).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
