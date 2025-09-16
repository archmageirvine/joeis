package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388114 Decimal expansion of (9/2) * Pi^(7/4) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388114 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388114() {
    super(1, CR.PI.pow(new Q(7, 4)).multiply(new Q(9, 2)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
