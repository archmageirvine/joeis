package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388355 Decimal expansion of 8 * exp(-Pi/3) * Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388355 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388355() {
    super(1, CR.PI.divide(-3).exp().multiply(8).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)).divide(CR.PI.square()));
  }
}
