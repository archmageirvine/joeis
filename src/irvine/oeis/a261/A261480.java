package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261480 Number of set partitions of [n] into exactly four parts such that no part contains two elements with a circular distance less than three.
 * @author Sean A. Irvine
 */
public class A261480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261480() {
    super(new long[] {-4, -4, -1, 4, 5, 1, 0}, new long[] {1, 0, 3, 7, 7, 21, 50});
  }
}
