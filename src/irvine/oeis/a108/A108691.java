package irvine.oeis.a108;
// manually 2022-02-25

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A108691 Continued fraction expansion of Pi^2/exp(gamma).
 * @author Georg Fischer
 */
public class A108691 extends ContinuedFractionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A108691() {
    super(new DecimalExpansionSequence(CR.PI.multiply(CR.PI).divide(REALS.exp(CR.GAMMA))));
  }
}
