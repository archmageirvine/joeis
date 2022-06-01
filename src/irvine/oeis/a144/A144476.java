package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144476 Four interlaced copies of A117373.
 * @author Sean A. Irvine
 */
public class A144476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144476() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 1, -1, 3, -2, -2, 2, 1});
  }
}
