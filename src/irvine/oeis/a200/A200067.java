package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200067 Maximum sum of all products of absolute differences and distances between element pairs among the integer partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A200067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200067() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 0, 0, 1, 3, 6, 12, 20});
  }
}
