package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238702 Sum of the smallest parts of the partitions of 4n into 4 parts.
 * @author Sean A. Irvine
 */
public class A238702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238702() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {1, 6, 21, 55, 119, 227, 396});
  }
}
