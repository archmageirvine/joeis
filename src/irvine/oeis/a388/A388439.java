package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388439 Decimal expansion of (9/256) * exp(Pi) * Pi^(5/2) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388439 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388439() {
    super(1, CR.PI.exp().multiply(new Q(9, 256)).multiply(CR.PI.pow(new Q(5, 2))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
