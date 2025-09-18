package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388438 Decimal expansion of (45/32) * Pi^(7/2) / Gamma(3/4)^14.
 * @author Sean A. Irvine
 */
public class A388438 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388438() {
    super(1, CR.PI.pow(new Q(7, 2)).multiply(new Q(45, 32)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(14)));
  }
}
