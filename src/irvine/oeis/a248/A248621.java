package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248621 Floor of sums of the squares of the non-integer cube roots of n, as partitioned by the integer roots: <code>floor[sum(j</code> from <code>n^3+1</code> to <code>(n+1)^3-1, j^(2/3))]</code>.
 * @author Sean A. Irvine
 */
public class A248621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248621() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 120, 456, 1240});
  }
}
