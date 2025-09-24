package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388931 Decimal expansion of (1/4) * exp(-Pi/24) * 2^(17/24) * Gamma(5/6)^(1/2) * Gamma(7/12) * (1+3^(1/2)) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388931 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388931() {
    super(1, CR.PI.divide(-24).exp().divide(4).multiply(CR.TWO.pow(new Q(17, 24))).multiply(CrFunctions.GAMMA.cr(new Q(5, 6)).sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
