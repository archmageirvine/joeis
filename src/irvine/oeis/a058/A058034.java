package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058034 Number of numbers whose cube root rounds to n.
 * @author Sean A. Irvine
 */
public class A058034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058034() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 3, 12, 27, 49, 75});
  }
}
