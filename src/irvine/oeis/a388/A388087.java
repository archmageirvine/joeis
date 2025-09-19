package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388087 Decimal expansion of (1/4) * exp(1/6 * Pi) * Pi * 2^(1/2) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388087 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388087() {
    super(1, CR.PI.multiply(new Q(1, 6)).exp().multiply(Q.ONE_QUARTER).multiply(CR.PI.multiply(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
