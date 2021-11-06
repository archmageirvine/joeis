package irvine.oeis.a053;
// manually at 2021-11-05

import irvine.oeis.a019.A019669;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A053300 Continued fraction for Pi/2.
 * @author Georg Fischer
 */
public class A053300 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A053300() {
    super(new A019669());
  }
}
