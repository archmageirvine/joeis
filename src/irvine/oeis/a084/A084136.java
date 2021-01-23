package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084136 Binomial transform of cosh(sqrt(2)*x)^2.
 * @author Sean A. Irvine
 */
public class A084136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084136() {
    super(new long[] {-7, 5, 3}, new long[] {1, 1, 5});
  }
}
