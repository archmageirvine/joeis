package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388945 Decimal expansion of (3^(3/4) * (1+sqrt(3)) * exp(-Pi/3) * Gamma(3/4)^3 * Gamma(5/3)) / (Pi * Gamma(11/12)).
 * @author Sean A. Irvine
 */
public class A388945 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388945() {
    super(1, CR.PI.divide(-3).exp().multiply(new Q(2, 3)).divide(CR.PI).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
