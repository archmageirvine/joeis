package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081079 <code>Lucas(4n+2) - 3,</code> or <code>5*Fibonacci(2n)*Fibonacci(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081079() {
    super(new long[] {1, -8, 8}, new long[] {0, 15, 120});
  }
}
