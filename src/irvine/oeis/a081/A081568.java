package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081568 Third binomial transform of Fibonacci(n+1).
 * @author Sean A. Irvine
 */
public class A081568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081568() {
    super(new long[] {-11, 7}, new long[] {1, 4});
  }
}
