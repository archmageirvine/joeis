package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241688 Number of Sidon subsets of {1,...,n} of size 4.
 * @author Sean A. Irvine
 */
public class A241688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241688() {
    super(new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {0, 0, 0, 0, 0, 0, 2, 10, 26, 60, 110});
  }
}
