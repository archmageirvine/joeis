package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164396.
 * @author Sean A. Irvine
 */
public class A164396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164396() {
    super(new long[] {-1, 1, 0, -1, 0, 2}, new long[] {1, 2, 4, 8, 14, 24});
  }
}
