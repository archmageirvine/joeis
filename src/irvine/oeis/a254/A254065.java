package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254065.
 * @author Sean A. Irvine
 */
public class A254065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254065() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 6, 3, 7, 4, 9, 8});
  }
}
