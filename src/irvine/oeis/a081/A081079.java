package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081079 Lucas(4n+2) - 3, or 5*Fibonacci(2n)*Fibonacci(2n+2).
 * @author Sean A. Irvine
 */
public class A081079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081079() {
    super(new long[] {1, -8, 8}, new long[] {0, 15, 120});
  }
}
