package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389022 Decimal expansion of 8 * exp(-5*Pi/8) * 2^(1/8) * Gamma(3/4)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A389022 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389022() {
    super(0, CR.PI.multiply(new Q(-5, 8)).exp().multiply(CR.TWO.pow(new Q(25, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
