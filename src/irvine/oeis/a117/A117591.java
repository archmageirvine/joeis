package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117591 <code>2^n + Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A117591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117591() {
    super(new long[] {-2, -1, 3}, new long[] {1, 3, 5});
  }
}
