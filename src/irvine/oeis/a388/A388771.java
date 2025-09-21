package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388771 Decimal expansion of (1/2) * exp(Pi / 8) * Pi * 2^(1/8) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388771 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388771() {
    super(1, CR.PI.divide(8).exp().multiply(CR.PI).multiply(CR.TWO.pow(new Q(-7, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
