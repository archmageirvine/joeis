package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388108 Decimal expansion of 4 * exp(-5/12 * Pi) / Pi * sqrt(2) * Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388108 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388108() {
    super(1, CR.PI.multiply(new Q(-5, 12)).exp().multiply(4).divide(CR.PI).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
