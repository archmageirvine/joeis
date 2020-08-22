package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a020.A020858;

/**
 * A028508 Continued fraction expansion for log_2(5).
 * @author Sean A. Irvine
 */
public class A028508 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028508() {
    super(new A020858());
  }
}
