package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388627 Decimal expansion of (3/512) * exp(3*Pi/2) * Pi^4 * sqrt(2) / Gamma(3/4)^16.
 * @author Sean A. Irvine
 */
public class A388627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388627() {
    super(1, CR.PI.multiply(new Q(3, 2)).exp().multiply(new Q(3, 512)).multiply(CR.PI.pow(4)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
