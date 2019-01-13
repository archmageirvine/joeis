package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212593.
 * @author Sean A. Irvine
 */
public class A212593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212593() {
    super(new long[] {-9, 0, 84, 0, -126, 0, 36, 0}, new long[] {1, 8, 15, 232, 449, 7400, 14351, 237832});
  }
}
