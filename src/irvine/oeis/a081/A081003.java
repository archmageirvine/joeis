package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081003 <code>a(n) = Fibonacci(4n+1) + 1</code>, or <code>Fibonacci(2n+1)*Lucas(2n)</code>.
 * @author Sean A. Irvine
 */
public class A081003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081003() {
    super(new long[] {1, -8, 8}, new long[] {2, 6, 35});
  }
}
