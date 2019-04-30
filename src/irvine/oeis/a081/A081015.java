package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081015 <code>Lucas(4n+3)+1</code>, or <code>5*Fibonacci(2n+1)*Fibonacci(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081015() {
    super(new long[] {1, -8, 8}, new long[] {5, 30, 200});
  }
}
