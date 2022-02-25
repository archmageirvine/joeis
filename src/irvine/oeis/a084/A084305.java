package irvine.oeis.a084;
// manually 2022-02-25

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084305 Continued fraction expansion of tanh(tanh(1)).
 * @author Georg Fischer
 */
public class A084305 extends ContinuedFractionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A084305() {
    super(new DecimalExpansionSequence(REALS.tanh(REALS.tanh(CR.ONE))));
  }
}
