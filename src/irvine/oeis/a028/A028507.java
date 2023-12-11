package irvine.oeis.a028;

import irvine.oeis.a020.A020857;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A028507 Continued fraction expansion for log_2(3).
 * @author Sean A. Irvine
 */
public class A028507 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028507() {
    super(new A020857());
  }
}
