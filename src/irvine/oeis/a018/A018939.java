package irvine.oeis.a018;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A018939 Continued fraction for e^Pi - Pi.
 * @author Sean A. Irvine
 */
public class A018939 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A018939() {
    super(new A018938());
  }
}
