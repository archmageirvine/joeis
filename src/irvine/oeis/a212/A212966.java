package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212966.
 * @author Sean A. Irvine
 */
public class A212966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212966() {
    super(new long[] {1, 0, -1, -2, 0, 2, 1, 0}, new long[] {1, 1, 3, 8, 10, 12, 23, 25});
  }
}
