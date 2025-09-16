package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388232 Decimal expansion of (1/4096) * exp(4*Pi/3) * Pi^8 / Gamma(3/4)^32.
 * @author Sean A. Irvine
 */
public class A388232 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388232() {
    super(0, CR.PI.multiply(new Q(4, 3)).exp().divide(4096).multiply(CR.PI.pow(8)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(32)));
  }
}
