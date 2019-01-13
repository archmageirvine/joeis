package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123613.
 * @author Sean A. Irvine
 */
public class A123613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123613() {
    super(new long[] {-1, 4, -6, 6, -9, 12, -9, 6, -6, 4}, new long[] {1, 4, 20, 68, 175, 392, 786, 1440, 2475, 4036});
  }
}
