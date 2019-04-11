package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157442 <code>a(n) = 14641*n^2 - 24684*n + 10405</code>.
 * @author Sean A. Irvine
 */
public class A157442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157442() {
    super(new long[] {1, -3, 3}, new long[] {362, 19601, 68122});
  }
}
