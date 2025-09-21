package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388748 Decimal expansion of (1/8) * exp(Pi / 2) * Pi^3 / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388748 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388748() {
    super(1, CR.HALF_PI.exp().divide(8).multiply(CR.PI.pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
