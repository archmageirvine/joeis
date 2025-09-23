package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389033 Decimal expansion of 768 * exp(-2 * Pi) * Gamma(3/4)^4 / Pi.
 * @author Sean A. Irvine
 */
public class A389033 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389033() {
    super(1, CR.TAU.negate().exp().multiply(768).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CR.PI));
  }
}
