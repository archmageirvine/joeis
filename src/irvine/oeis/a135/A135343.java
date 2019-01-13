package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135343.
 * @author Sean A. Irvine
 */
public class A135343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135343() {
    super(new long[] {4, 3, -1, 4, 3}, new long[] {1, 3, 12, 51, 205});
  }
}
