package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388702 Decimal expansion of (9/16) * exp(-Pi) * Gamma(2/3)^4 * Gamma(3/4)^4 * (1+3^(1/2))^4 / Gamma(11/12)^4 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388702 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388702() {
    super(0, CR.PI.negate().exp().multiply(new Q(9, 16)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).multiply(CR.THREE.sqrt().add(1).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).divide(CR.PI.square()));
  }
}
