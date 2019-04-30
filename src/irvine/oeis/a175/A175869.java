package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175869 Partial sums of <code>ceiling(n^2/23)</code>.
 * @author Sean A. Irvine
 */
public class A175869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175869() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4, 6, 8, 11, 14, 18, 23, 29, 36, 44, 53, 63, 75, 88, 103, 119, 137, 157, 179, 202, 228, 256});
  }
}
