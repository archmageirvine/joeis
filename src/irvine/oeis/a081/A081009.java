package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081009 <code>a(n) = Fibonacci(4n+3) - 1</code>, or <code>Fibonacci(2n+2)*Lucas(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081009() {
    super(new long[] {1, -8, 8}, new long[] {1, 12, 88});
  }
}
