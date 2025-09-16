package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388208 Decimal expansion of (243/32) * Pi^5 / Gamma(3/4)^20.
 * @author Sean A. Irvine
 */
public class A388208 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388208() {
    super(2, CR.PI.pow(5).multiply(new Q(243, 32)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)));
  }
}
