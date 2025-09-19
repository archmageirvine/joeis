package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388089 Decimal expansion of (1/8) * exp(Pi/4) * Pi^(3/2) * 2^(3/4) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388089 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388089() {
    super(0, CR.PI.divide(4).exp().divide(8).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
