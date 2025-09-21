package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388704 Decimal expansion of (1/8) * exp(Pi / 3) * Pi * 2^(3/4) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388704 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388704() {
    super(0, CR.PI.divide(3).exp().multiply(CR.PI).multiply(CR.TWO.pow(new Q(-9, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
