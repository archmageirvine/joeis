package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388772 Decimal expansion of (1/16) * exp(Pi / 2) * Pi^2*2^(1/4) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388772 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388772() {
    super(0, CR.HALF_PI.exp().divide(16).multiply(CR.PI.square()).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
