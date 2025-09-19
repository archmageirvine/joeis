package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388559 Decimal expansion of (1/24) * 3^(1/4) * Gamma(2/3)^3 * Gamma(3/4) * (1+3^(1/2))^3 / Gamma(11/12)^3 / Pi.
 * @author Sean A. Irvine
 */
public class A388559 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388559() {
    super(0, CR.THREE.pow(Q.ONE_QUARTER).divide(24).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CR.ONE.add(CR.THREE.sqrt()).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).divide(CR.PI));
  }
}
