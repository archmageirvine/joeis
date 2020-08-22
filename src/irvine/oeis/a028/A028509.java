package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a020.A020860;

/**
 * A028509 Continued fraction expansion for log_2(7).
 * @author Sean A. Irvine
 */
public class A028509 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028509() {
    super(new A020860());
  }
}
