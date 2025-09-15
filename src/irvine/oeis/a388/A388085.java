package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388085 Decimal expansion of exp(-1/12 * Pi) / Pi^(1/2) * 2^(3/4) * Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388085 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388085() {
    super(1, CR.PI.divide(-12).exp().multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CR.PI.sqrt()));
  }
}
