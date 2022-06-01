package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081073 Fibonacci(4n+2)+3, or Fibonacci(2n-1)*Lucas(2n+3).
 * @author Sean A. Irvine
 */
public class A081073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081073() {
    super(new long[] {1, -8, 8}, new long[] {4, 11, 58});
  }
}
