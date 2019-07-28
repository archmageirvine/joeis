package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081008 <code>a(n) = Fibonacci(4n+2) - 1</code>, or <code>Fibonacci(2n)*Lucas(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081008() {
    super(new long[] {1, -8, 8}, new long[] {0, 7, 54});
  }
}
