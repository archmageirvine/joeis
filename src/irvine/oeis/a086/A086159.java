package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086159 Number of partitions of n into the first three triangular numbers, <code>1, 3</code> and 6.
 * @author Sean A. Irvine
 */
public class A086159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086159() {
    super(new long[] {1, -1, 0, -1, 1, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 4, 4, 4, 6});
  }
}
