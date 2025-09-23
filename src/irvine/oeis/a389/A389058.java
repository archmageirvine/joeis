package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389058 Decimal expansion of (1/512) / Pi^(9/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A389058 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389058() {
    super(0, CR.PI.pow(new Q(9, 4)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).multiply(512).inverse());
  }
}
