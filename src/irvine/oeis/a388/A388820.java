package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388820 Decimal expansion of (1/2) * exp(-Pi/8) * 2^(35/72) * 3^(1/3) * Gamma(3/4)^(1/3) * Gamma(5/6)^(1/6) * (sqrt(2) * (1+3^(1/2)))^(1/3) / Gamma(11/12)^(1/3) / Pi^(1/12).
 * @author Sean A. Irvine
 */
public class A388820 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388820() {
    super(1, CR.PI.divide(-8).exp().divide(2).multiply(CR.TWO.pow(new Q(35, 72))).multiply(CR.THREE.pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(5, 6)).pow(new Q(1, 6))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(Q.ONE_THIRD)).divide(CR.PI.pow(new Q(1, 12))));
  }
}
