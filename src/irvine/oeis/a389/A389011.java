package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389011 Decimal expansion of (9/2048) * exp(5*Pi/6) * 3^(1/2) * Gamma(2/3)^5 * Gamma(11/12)^7 * Gamma(7/12)^12 * (2+3^(1/2)) / Pi / Gamma(3/4)^25.
 * @author Sean A. Irvine
 */
public class A389011 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389011() {
    super(0, CR.PI.multiply(new Q(5, 6)).exp().multiply(new Q(9, 2048)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(5)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(7)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(12)).multiply(CR.TWO.add(CR.THREE.sqrt())).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(25)));
  }
}
