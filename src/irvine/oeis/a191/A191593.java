package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191593 Number of partitions of <code>12*n</code> into parts <code>&lt; 5</code>.
 * @author Sean A. Irvine
 */
public class A191593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191593() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 34, 169, 478});
  }
}
