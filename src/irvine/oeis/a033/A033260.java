package irvine.oeis.a033;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A033260 Continued fraction for Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033260 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A033260() {
    super(new A033259());
  }
}
