package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388086 Decimal expansion of 2 * exp(-1/8 * Pi) / Pi^(3/4) * 2^(1/8) * Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388086 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388086() {
    super(1, CR.PI.divide(-8).exp().multiply(2).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
