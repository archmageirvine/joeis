package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389035 Decimal expansion of (1/16) * Pi^4 / Gamma(3/4)^16.
 * @author Sean A. Irvine
 */
public class A389035 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389035() {
    super(0, CR.PI.pow(4).divide(16).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
