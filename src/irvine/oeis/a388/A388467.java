package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388467 Decimal expansion of 16777216 * exp(-8*Pi/3) * Gamma(3/4)^64 / Pi^16.
 * @author Sean A. Irvine
 */
public class A388467 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388467() {
    super(2, CR.PI.multiply(new Q(-8, 3)).exp().multiply(16777216).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(64)).divide(CR.PI.pow(16)));
  }
}
