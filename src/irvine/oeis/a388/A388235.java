package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388235 Decimal expansion of (1/32768) * exp(5*Pi/3) * Pi^10 / Gamma(3/4)^40.
 * @author Sean A. Irvine
 */
public class A388235 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388235() {
    super(0, CR.PI.multiply(new Q(5, 3)).exp().divide(32768).multiply(CR.PI.pow(10)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(40)));
  }
}
