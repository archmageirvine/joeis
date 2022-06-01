package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093132 Third binomial transform of Fibonacci(3n+2).
 * @author Sean A. Irvine
 */
public class A093132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093132() {
    super(new long[] {-20, 10}, new long[] {1, 8});
  }
}
