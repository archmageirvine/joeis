package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069756.
 * @author Sean A. Irvine
 */
public class A069756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069756() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {23, 119, 359, 839, 1679});
  }
}
