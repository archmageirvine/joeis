package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081070 Lucas(4n)-2, or 5*Fibonacci(2n)^2.
 * @author Sean A. Irvine
 */
public class A081070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081070() {
    super(new long[] {1, -8, 8}, new long[] {0, 5, 45});
  }
}
