package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388874 Decimal expansion of (1/8) * exp(Pi / 2) * Pi^(3/4) * 2^(1/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388874 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388874() {
    super(0, CR.HALF_PI.exp().divide(8).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
