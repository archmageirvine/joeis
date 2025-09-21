package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388739 Decimal expansion of (9/4) * Pi^(5/2) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388739 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388739() {
    super(1, CR.PI.pow(new Q(5, 2)).multiply(new Q(9, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
