package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388804 Decimal expansion of (1/32) * exp(3*Pi/4) * Pi^2*2^(3/4) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388804 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388804() {
    super(1, CR.PI.multiply(new Q(3, 4)).exp().divide(32).multiply(CR.PI.square()).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
