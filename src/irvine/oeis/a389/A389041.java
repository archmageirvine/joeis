package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389041 Decimal expansion of 8 * Gamma(3/4)^12 / Pi^3.
 * @author Sean A. Irvine
 */
public class A389041 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389041() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12).multiply(8).divide(CR.PI.pow(3)));
  }
}
