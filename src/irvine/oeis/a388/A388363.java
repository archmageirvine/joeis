package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388363 Decimal expansion of 64 * exp(-2*Pi/3) * Gamma(3/4)^16 / Pi^4.
 * @author Sean A. Irvine
 */
public class A388363 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388363() {
    super(1, CR.PI.multiply(new Q(-2, 3)).exp().multiply(64).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)).divide(CR.PI.pow(4)));
  }
}
