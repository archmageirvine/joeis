package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238706 Sum of the smallest parts of the partitions of 4n into 4 parts with smallest part greater than 1.
 * @author Sean A. Irvine
 */
public class A238706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238706() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 2, 11, 36, 89, 183, 335});
  }
}
