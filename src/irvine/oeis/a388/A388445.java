package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388445 Decimal expansion of exp(-Pi/12) * Gamma(2/3)^(2/3) * Gamma(3/4)^(1/3) * Gamma(7/12)^(2/3) * 6^(1/4) / Pi^(7/12) / (sqrt(2) * (3^(1/2)-1))^(2/3).
 * @author Sean A. Irvine
 */
public class A388445 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388445() {
    super(1, CR.PI.divide(-12).exp().multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(1, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(2, 3))).multiply(CR.SIX.pow(Q.ONE_QUARTER)).divide(CR.PI.pow(new Q(7, 12))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(2, 3))));
  }
}
