package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067705 a(n) = 11*n^2 + 22*n.
 * @author Sean A. Irvine
 */
public class A067705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067705() {
    super(1, new long[] {1, -3, 3}, new long[] {33, 88, 165});
  }
}
