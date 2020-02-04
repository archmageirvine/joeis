package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a020.A020857;

/**
 * A028507 Continued fraction expansion for <code>log_2(3)</code>.
 * @author Sean A. Irvine
 */
public class A028507 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028507() {
    super(new A020857());
  }
}
