package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388779 Decimal expansion of (1/128) * exp(5*Pi/4) * Pi^2*2^(1/4) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388779() {
    super(0, CR.PI.multiply(new Q(5, 4)).exp().divide(128).multiply(CR.PI.square()).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
