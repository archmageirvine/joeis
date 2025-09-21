package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388677 Decimal expansion of (3/32) * exp(Pi / 2) * Pi * Gamma(11/12)^7 * Gamma(7/12)^7 / Gamma(3/4)^18.
 * @author Sean A. Irvine
 */
public class A388677 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388677() {
    super(1, CR.HALF_PI.exp().multiply(new Q(3, 32)).multiply(CR.PI).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(7)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(7)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(18)));
  }
}
