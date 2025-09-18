package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388483 Decimal expansion of (1/2) * exp(Pi / 12) * Pi^(1/4) * 2^(5/8) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388483 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388483() {
    super(1, CR.PI.divide(12).exp().multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(-3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
