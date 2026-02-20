package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388479 Decimal expansion of 15 * Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388479 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388479() {
    super(2, CR.PI.square().multiply(15).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
