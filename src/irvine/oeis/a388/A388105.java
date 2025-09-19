package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388105 Decimal expansion of (1/64) * Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388105 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388105() {
    super(0, CR.PI.square().divide(64).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
