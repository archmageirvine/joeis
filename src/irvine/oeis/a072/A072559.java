package irvine.oeis.a072;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A072559 Continued fraction expansion of the One-ninth constant (A072558).
 * @author Sean A. Irvine
 */
public class A072559 extends ContinuedFractionSequence {

  /** Construct the sequence */
  public A072559() {
    super(0, new A072558());
  }
}
