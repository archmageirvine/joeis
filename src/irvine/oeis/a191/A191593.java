package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191593 Number of partitions of 12*n into parts &lt; 5.
 * @author Sean A. Irvine
 */
public class A191593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191593() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 34, 169, 478});
  }
}
