package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388110 Decimal expansion of (1/64) * exp(Pi) * Pi^(9/2) / Gamma(3/4)^18.
 * @author Sean A. Irvine
 */
public class A388110 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388110() {
    super(1, CR.PI.exp().divide(64).multiply(CR.PI.pow(new Q(9, 2))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(18)));
  }
}
