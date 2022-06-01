package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093130 Third binomial transform of Fibonacci(3n).
 * @author Sean A. Irvine
 */
public class A093130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093130() {
    super(new long[] {-20, 10}, new long[] {0, 2});
  }
}
