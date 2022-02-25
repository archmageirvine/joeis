package irvine.oeis.a060;
// manually 2022-02-25

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060402 Continued fraction expansion of tanh(Pi).
 * @author Georg Fischer
 */
public class A060402 extends ContinuedFractionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A060402() {
    super(new DecimalExpansionSequence(REALS.tanh(CR.PI)));
  }
}
