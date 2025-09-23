package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389053 Decimal expansion of (1/48) * 3^(3/4) * Gamma(2/3) * 2^(1/4) * Gamma(5/8)^3 * (2+sqrt(2))^(3/2) / (3^(1/2)-1) / (sqrt(2)-1) / Pi / Gamma(7/8)^3 / Gamma(11/12).
 * @author Sean A. Irvine
 */
public class A389053 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389053() {
    super(1, CR.THREE.pow(new Q(3, 4)).divide(48).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.THREE.sqrt().subtract(1)).divide(CR.SQRT2.subtract(1)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
