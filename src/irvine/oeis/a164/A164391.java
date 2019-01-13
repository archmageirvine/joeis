package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164391.
 * @author Sean A. Irvine
 */
public class A164391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164391() {
    super(new long[] {-1, -1, 0, 1, 1, 1}, new long[] {1, 2, 4, 8, 14, 25});
  }
}
