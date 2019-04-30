package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248575 Rounded sums of the non-integer cube roots of n, as partitioned by the integer roots: round[sum(j from <code>n^3+1</code> to <code>(n+1)^3-1, j^(1/3))]</code>.
 * @author Sean A. Irvine
 */
public class A248575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248575() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 10, 46, 128, 272});
  }
}
