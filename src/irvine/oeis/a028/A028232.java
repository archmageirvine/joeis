package irvine.oeis.a028;

import irvine.oeis.a007.A007524;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A028232 Continued fraction expansion for log_2(10).
 * @author Sean A. Irvine
 */
public class A028232 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028232() {
    super(new A007524());
    next();
  }
}
