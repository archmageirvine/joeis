package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388633 Decimal expansion of (1/64) * exp(Pi) * Pi^(3/2) * sqrt(2) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388633 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388633() {
    super(0, CR.PI.exp().divide(64).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
