package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062890 Number of quadrilaterals that can be formed with perimeter n. In other words, number of partitions of n into four parts such that the sum of <code>any</code> three is more than the fourth.
 * @author Sean A. Irvine
 */
public class A062890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062890() {
    super(new long[] {-1, 1, 1, -1, 1, -1, 0, 0, -1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 2, 3, 4, 5, 7, 8});
  }
}
