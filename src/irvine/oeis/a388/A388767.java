package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388767 Decimal expansion of -(1/4) * Gamma(2/3)^2 / Gamma(11/12)^3 / Gamma(7/12) / (-2+3^(1/2)).
 * @author Sean A. Irvine
 */
public class A388767 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388767() {
    super(0, CrFunctions.GAMMA.cr(new Q(2, 3)).square().divide(-4).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CR.THREE.sqrt().subtract(2)));
  }
}
