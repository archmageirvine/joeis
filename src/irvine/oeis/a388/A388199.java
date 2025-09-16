package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388199 Decimal expansion of (81/16) * Pi^4 / Gamma(3/4)^16.
 * @author Sean A. Irvine
 */
public class A388199 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388199() {
    super(2, CR.PI.pow(4).multiply(new Q(81, 16)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
