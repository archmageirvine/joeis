package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388164 Decimal expansion of exp(Pi / 2) * Pi * sqrt(2) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388164 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388164() {
    super(1, CR.HALF_PI.exp().multiply(CR.PI).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
