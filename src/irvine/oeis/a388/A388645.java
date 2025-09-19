package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388645 Decimal expansion of (1/2) * Pi^(1/6) * 3^(7/12) * Gamma(11/12)^(4/3) * Gamma(7/12) * 2^(1/3) / (1+3^(1/2))^(1/3) / Gamma(2/3)^(1/3) / Gamma(3/4)^(7/3).
 * @author Sean A. Irvine
 */
public class A388645 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388645() {
    super(0, CR.PI.pow(new Q(1, 6)).divide(2).multiply(CR.THREE.pow(new Q(7, 12))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(4, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.TWO.pow(Q.ONE_THIRD)).divide(CR.ONE.add(CR.THREE.sqrt()).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(7, 3))));
  }
}
