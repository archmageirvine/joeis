package irvine.oeis.a072;

import irvine.oeis.a060.A060006;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A072117 Continued fraction expansion of smallest Pisot-Vijayaraghavan number (positive root of x^3 = x + 1 ).
 * @author Sean A. Irvine
 */
public class A072117 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A072117() {
    super(0, new A060006());
  }
}
