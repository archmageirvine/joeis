package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388486 Decimal expansion of exp(-5*Pi/24) * 2^(35/72) * 3^(5/12) * Gamma(3/4)^(2/3) * Gamma(5/6)^(1/6) / (sqrt(2) * (3^(1/2)-1))^(1/3) * Gamma(7/12)^(1/3) / Pi^(1/3).
 * @author Sean A. Irvine
 */
public class A388486 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388486() {
    super(1, CR.PI.multiply(new Q(-5, 24)).exp().multiply(CR.TWO.pow(new Q(35, 72))).multiply(CR.THREE.pow(new Q(5, 12))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(5, 6)).pow(new Q(1, 6))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(1, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(1, 3)).divide(CR.PI.pow(new Q(1, 3)))));
  }
}
