package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093133 Third binomial transform of <code>Fib(3n-3)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A093133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093133() {
    super(new long[] {-20, 10}, new long[] {1, 3});
  }
}
