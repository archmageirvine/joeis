package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388210 Decimal expansion of (1/2) * exp(Pi / 8) * Pi^(1/4) * 2^(3/8) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388210 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388210() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
