package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060945 Number of compositions (ordered partitions) of n into 1's, 2's and 4's.
 * @author Sean A. Irvine
 */
public class A060945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060945() {
    super(new long[] {1, 0, 1, 1}, new long[] {1, 1, 2, 3});
  }
}
