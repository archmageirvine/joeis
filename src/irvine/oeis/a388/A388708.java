package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388708 Decimal expansion of (1/1600) * 5^(3/4) * Gamma(2/3) * Gamma(7/12) * (5-5^(1/2))^(3/2) * (1+3^(1/2)) * (5^(1/2)+1)^3 / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388708 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388708() {
    super(1, CR.FIVE.pow(new Q(3, 4)).divide(1600).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).multiply(CR.ONE.add(CR.THREE.sqrt())).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
