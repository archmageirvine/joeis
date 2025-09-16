package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388111 Decimal expansion of (9/256) * exp(Pi) * Pi^(9/2) / Gamma(3/4)^18.
 * @author Sean A. Irvine
 */
public class A388111 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388111() {
    super(1, CR.PI.exp().multiply(new Q(9, 256)).multiply(CR.PI.pow(new Q(9, 2))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(18)));
  }
}
