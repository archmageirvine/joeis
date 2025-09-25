package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388681 Decimal expansion of ((3+sqrt(3)) * Gamma(7/12)^3 * Gamma(2/3) * Gamma(11/12)^2) / (4*2^(3/4) * Gamma(3/4)^7).
 * @author Sean A. Irvine
 */
public class A388681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388681() {
    super(0, CR.TWO.pow(Q.ONE_QUARTER).divide(8).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
