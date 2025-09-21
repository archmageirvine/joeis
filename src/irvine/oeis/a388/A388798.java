package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388798 Decimal expansion of Pi^(2/3) * 3^(1/3) * Gamma(11/12)^(1/3) / Gamma(2/3)^(1/3) / Gamma(3/4)^(7/3) / (sqrt(2) * (1+3^(1/2)))^(1/3).
 * @author Sean A. Irvine
 */
public class A388798 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388798() {
    super(1, CR.PI.pow(new Q(2, 3)).multiply(CR.THREE.pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(7, 3))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)));
  }
}
