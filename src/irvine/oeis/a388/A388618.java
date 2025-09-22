package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388618 Decimal expansion of 32 * exp(-Pi) * Gamma(3/4)^5 / Pi^(5/4).
 * @author Sean A. Irvine
 */
public class A388618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388618() {
    super(0, CR.PI.negate().exp().multiply(32).divide(CR.PI.pow(new Q(5, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
