package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282465 <code>a(n) =</code> 11*Fibonacci(n+3) + Fibonacci(n-8) with <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A282465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282465() {
    super(new long[] {1, 1}, new long[] {1, 46});
  }
}
