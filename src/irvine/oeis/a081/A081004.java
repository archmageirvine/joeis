package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081004 <code>a(n) = Fibonacci(4n+2) + 1</code>, or <code>Fibonacci(2n+2)*Lucas(2n)</code>.
 * @author Sean A. Irvine
 */
public class A081004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081004() {
    super(new long[] {1, -8, 8}, new long[] {2, 9, 56});
  }
}
