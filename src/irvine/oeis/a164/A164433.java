package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164433.
 * @author Sean A. Irvine
 */
public class A164433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164433() {
    super(new long[] {-1, -1, 0, 2, 0, 1}, new long[] {13, 21, 34, 54, 84, 131});
  }
}
