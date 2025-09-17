package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388376 Decimal expansion of (1/64) * exp(Pi) * Pi^(9/4) / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388376 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388376() {
    super(0, CR.PI.exp().divide(64).multiply(CR.PI.pow(new Q(9, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
