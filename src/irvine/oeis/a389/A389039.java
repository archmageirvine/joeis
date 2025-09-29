package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389039 Decimal expansion of (2 / Pi)^(3/4) * Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A389039 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389039() {
    super(1, CR.TWO.pow(new Q(3, 4)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
