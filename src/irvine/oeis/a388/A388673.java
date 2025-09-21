package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388673 Decimal expansion of (3/8) * exp(Pi / 3) * Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388673 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388673() {
    super(1, CR.PI.divide(3).exp().multiply(new Q(3, 8)).multiply(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
