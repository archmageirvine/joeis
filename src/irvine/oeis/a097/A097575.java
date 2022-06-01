package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097575 A 2 X 2 matrix Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A097575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097575() {
    super(new long[] {1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 1, 1, 2, 1, 2, 2, 3});
  }
}
