package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117143 Number of partitions of n in which any two parts differ by at most 3.
 * @author Sean A. Irvine
 */
public class A117143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117143() {
    super(new long[] {-1, 1, 1, 1, -2, -2, 1, 1, 1}, new long[] {1, 2, 3, 5, 7, 10, 13, 17, 22});
  }
}
