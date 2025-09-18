package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388526 Decimal expansion of (1/16) * exp(Pi / 4) * 2^(1/4) * 3^(1/2) * Gamma(2/3) * Gamma(11/12)^2 * Gamma(7/12)^3 * (1+3^(1/2)) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388526 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388526() {
    super(1, CR.PI.divide(4).exp().divide(16).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
