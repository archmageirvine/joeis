package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270863 Self-composition of the Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A270863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270863() {
    super(new long[] {-1, -3, 1, 3}, new long[] {0, 1, 2, 6});
  }
}
