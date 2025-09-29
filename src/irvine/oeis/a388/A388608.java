package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388608 Decimal expansion of ((Pi / 2)^(3/4) * exp(Pi / 8)) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388608() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
