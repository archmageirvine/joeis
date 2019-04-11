package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107584 <code>a(n) = 4^n - 4*n</code>.
 * @author Sean A. Irvine
 */
public class A107584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107584() {
    super(new long[] {4, -9, 6}, new long[] {1, 0, 8});
  }
}
