package irvine.oeis.a083;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A083287 Continued fraction expansion of K(3), a constant related to the Josephus problem.
 * @author Sean A. Irvine
 */
public class A083287 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A083287() {
    super(0, new A083286());
  }
}
