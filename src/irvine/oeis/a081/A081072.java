package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081072 <code>Fibonacci(4n) + 3,</code> or <code>Fibonacci(2n+2)*Lucas(2n-2)</code>.
 * @author Sean A. Irvine
 */
public class A081072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081072() {
    super(new long[] {1, -8, 8}, new long[] {3, 6, 24});
  }
}
