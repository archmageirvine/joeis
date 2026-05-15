package irvine.oeis.a084;

import irvine.oeis.a076.A076813;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A084862 Continued fraction expansion of Sum_{n&gt;=1} zeta( 2*n ) / n!.
 * @author Sean A. Irvine
 */
public class A084862 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A084862() {
    super(0, new A076813());
  }
}
