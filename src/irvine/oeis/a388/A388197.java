package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388197 Decimal expansion of (9/4) * Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388197 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388197() {
    super(1, CR.PI.square().multiply(new Q(9, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
