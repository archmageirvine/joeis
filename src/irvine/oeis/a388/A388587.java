package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388587 Decimal expansion of (1/4) * exp(Pi / 8) * Pi^(3/2) * 2^(3/8) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388587() {
    super(0, CR.PI.divide(8).exp().multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(new Q(-13, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
