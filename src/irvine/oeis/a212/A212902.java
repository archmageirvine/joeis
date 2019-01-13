package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212902.
 * @author Sean A. Irvine
 */
public class A212902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212902() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {0, 0, 2, 14, 44, 110, 228, 426, 726});
  }
}
