package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287582 Number of set partitions of <code>[n]</code> such that all absolute differences between least elements of consecutive blocks and between consecutive elements within the blocks are not larger than three.
 * @author Sean A. Irvine
 */
public class A287582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287582() {
    super(new long[] {2, 1, -7, -6, 10, 11, -10, -2, -2, 4}, new long[] {1, 1, 2, 5, 15, 46, 139, 410, 1189, 3397});
  }
}
