package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287276 Number of set partitions of [n] such that for each block all absolute differences between consecutive elements are <code>&lt;=</code> four.
 * @author Sean A. Irvine
 */
public class A287276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287276() {
    super(new long[] {-1, 1, 0, 7, -7, -1, -4, 5}, new long[] {1, 1, 2, 5, 15, 52, 188, 696});
  }
}
