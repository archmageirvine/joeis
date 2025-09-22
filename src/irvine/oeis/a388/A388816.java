package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388816 Decimal expansion of (1/4) * exp(Pi/6) * Pi^(3/4) * 2^(3/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388816 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388816() {
    super(0, CR.PI.divide(6).exp().divide(4).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
