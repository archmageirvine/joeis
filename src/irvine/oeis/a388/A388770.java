package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388770 Decimal expansion of (1/4) * exp(Pi / 4) * Pi * 2^(1/8) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388770 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388770() {
    super(0, CR.PI.divide(4).exp().multiply(CR.PI).multiply(CR.TWO.pow(new Q(-15, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
