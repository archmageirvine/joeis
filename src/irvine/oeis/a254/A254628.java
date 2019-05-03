package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254628 Triangular numbers <code>(A000217)</code> that are also centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A254628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254628() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 6, 276, 1891, 88831});
  }
}
