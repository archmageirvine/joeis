package irvine.oeis.a018;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A018939 Continued fraction for <code>e^Pi - Pi</code>.
 * @author Sean A. Irvine
 */
public class A018939 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A018939() {
    super(new A018938());
  }
}
