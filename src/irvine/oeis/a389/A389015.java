package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389015 Decimal expansion of (3/16) * Gamma(2/3)^2 * Gamma(11/12)^3 * Gamma(7/12)^5 * (2+3^(1/2)) / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A389015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389015() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(5)).multiply(new Q(3, 16)).multiply(CR.TWO.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
