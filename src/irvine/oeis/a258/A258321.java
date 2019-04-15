package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258321 <code>a(n) = Fibonacci(n) + n*Lucas(n)</code>.
 * @author Sean A. Irvine
 */
public class A258321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258321() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 2, 7, 14});
  }
}
