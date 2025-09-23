package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389059 Decimal expansion of (1/4096) / Pi^3 / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A389059 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389059() {
    super(0, CR.PI.pow(3).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).multiply(4096).inverse());
  }
}
