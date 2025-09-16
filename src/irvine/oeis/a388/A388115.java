package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388115 Decimal expansion of (3/2) * Pi / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388115 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388115() {
    super(1, CR.PI.multiply(new Q(3, 2)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
