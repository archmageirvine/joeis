package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093145 Third binomial transform of Fibonacci(3n)/Fibonacci(3).
 * @author Sean A. Irvine
 */
public class A093145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093145() {
    super(new long[] {-20, 10}, new long[] {0, 1});
  }
}
