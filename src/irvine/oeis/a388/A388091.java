package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388091 Decimal expansion of 1/8 * exp(1/3 * Pi) * Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388091 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388091() {
    super(0, CR.PI.divide(3).exp().divide(8).multiply(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
