package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081007 a(n) = Fibonacci(4n+1) - 1, or Fibonacci(2n)*Lucas(2n+1).
 * @author Sean A. Irvine
 */
public class A081007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081007() {
    super(new long[] {1, -8, 8}, new long[] {0, 4, 33});
  }
}
