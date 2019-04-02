package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147685 Squares and centered square numbers interleaved.
 * @author Sean A. Irvine
 */
public class A147685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147685() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 1, 5, 4, 13});
  }
}
