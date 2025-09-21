package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388773 Decimal expansion of (3/8) * exp(Pi / 4) * Pi^2*2^(1/4) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388773 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388773() {
    super(1, CR.PI.divide(4).exp().multiply(new Q(3, 8)).multiply(CR.PI.square()).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
