package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388511 Decimal expansion of (1/12) * 2^(1/12) * 3^(1/2) * Gamma(5/6)^(1/2) * Gamma(5/8) * (1+3^(1/2)) * (1+sqrt(2)) / Pi^(1/4) / Gamma(7/8) / Gamma(11/12).
 * @author Sean A. Irvine
 */
public class A388511 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388511() {
    super(1, CR.TWO.pow(new Q(1, 12)).divide(12).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 6)).sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.ONE.add(CR.THREE.sqrt())).multiply(CR.ONE.add(CR.SQRT2)).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
