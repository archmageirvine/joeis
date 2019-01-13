package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164460.
 * @author Sean A. Irvine
 */
public class A164460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164460() {
    super(new long[] {-1, 1, 1, -1, -1, 0, 2}, new long[] {13, 21, 33, 50, 76, 115, 173});
  }
}
