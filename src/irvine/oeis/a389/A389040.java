package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389040 Decimal expansion of 4 * Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A389040 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389040() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8).multiply(4).divide(CR.PI.square()));
  }
}
