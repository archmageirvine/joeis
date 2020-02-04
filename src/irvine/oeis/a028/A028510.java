package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a020.A020861;

/**
 * A028510 Continued fraction expansion for <code>log_2(9)</code>.
 * @author Sean A. Irvine
 */
public class A028510 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028510() {
    super(new A020861());
  }
}
