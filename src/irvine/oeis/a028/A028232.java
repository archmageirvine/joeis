package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a007.A007524;

/**
 * A028232 Continued fraction expansion for <code>log_2(10)</code>.
 * @author Sean A. Irvine
 */
public class A028232 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028232() {
    super(new A007524());
    next();
  }
}
