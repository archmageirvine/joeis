package irvine.oeis.a294;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A294053 Number of set partitions of [n] such that the maximal absolute difference between consecutive elements within a block equals four.
 * @author Sean A. Irvine
 */
public class A294053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294053() {
    super(new long[] {1, -3, 0, -1, 16, 2, -40, 20, 0, 23, -26, 9}, new long[] {5, 38, 215, 1061, 4835, 20973, 88010, 360787, 1453978, 5784863, 22790024, 89092968});
  }
}
