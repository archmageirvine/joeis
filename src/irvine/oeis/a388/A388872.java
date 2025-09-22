package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388872 Decimal expansion of (1/4) * Gamma(2/3)^2 * Gamma(7/12)^2 * (2+3^(1/2)) / Pi^(1/4) / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388872 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388872() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt())).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(4).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
