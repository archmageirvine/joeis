package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254627 Indices of centered pentagonal numbers <code>(A005891)</code> that are also triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A254627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254627() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {1, 2, 11, 28, 189});
  }
}
