package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072708 Last digit of <code>F(n)</code> is 6 where <code>F(n)</code> is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072708() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {21, 39, 42, 48, 81});
  }
}
