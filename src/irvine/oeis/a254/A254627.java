package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254627 Indices of centered pentagonal numbers (A005891) that are also triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A254627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254627() {
    super(1, new long[] {1, -1, -18, 18, 1}, new long[] {1, 2, 11, 28, 189});
  }
}
