package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388930 Decimal expansion of (1/18) * exp(2*Pi/3) * 3^(1/2) * Pi^(3/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388930 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388930() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().divide(18).multiply(CR.THREE.sqrt()).multiply(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
