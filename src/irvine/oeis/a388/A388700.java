package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388700 Decimal expansion of (1/2) * exp(Pi/6) * Pi / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388700 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388700() {
    super(1, CR.PI.multiply(new Q(1, 6)).exp().divide(2).multiply(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
