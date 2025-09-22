package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388893 Decimal expansion of -(27/16384) * exp(17*Pi/24) * sqrt(2) * Gamma(2/3)^16 * Gamma(7/12)^(11/2) * (11*3^(1/2)+19) / Pi^(27/4) / Gamma(11/12)^(21/2) / (-2+3^(1/2)) / (sqrt(2) * (3^(1/2)-1))^(1/2).
 * @author Sean A. Irvine
 */
public class A388893 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388893() {
    super(0, CR.PI.multiply(new Q(17, 24)).exp().multiply(new Q(-27, 16384)).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(16)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(11, 2))).multiply(CR.THREE.sqrt().multiply(11).add(19)).divide(CR.PI.pow(new Q(27, 4))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(21, 2))).divide(CR.THREE.sqrt().subtract(2)).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).sqrt()));
  }
}
