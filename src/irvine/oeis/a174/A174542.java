package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174542 Partial sums of odd Fibonacci numbers (A014437).
 * @author Sean A. Irvine
 */
public class A174542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174542() {
    super(new long[] {-1, 1, -4, 4, 1}, new long[] {1, 2, 5, 10, 23});
  }
}
