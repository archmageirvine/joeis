package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388922 Decimal expansion of ((2+sqrt(2)) * exp(-Pi/6) * Gamma(1/4) * sin(Pi / 8)) / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388922 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388922() {
    super(1, CR.PI.divide(-6).exp().divide(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
