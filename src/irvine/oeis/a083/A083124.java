package irvine.oeis.a083;
// manually 2022-02-25

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083124 Continued fraction expansion of tanh(Pi/2).
 * @author Georg Fischer
 */
public class A083124 extends ContinuedFractionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A083124() {
    super(0, new DecimalExpansionSequence(REALS.tanh(CR.PI.divide(CR.TWO))));
  }
}
