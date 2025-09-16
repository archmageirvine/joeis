package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388109 Decimal expansion of exp(-1/8 * Pi) / sqrt(Pi) * 2^(7/8) * Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388109 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388109() {
    super(1, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(7, 8))).divide(CR.PI.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
