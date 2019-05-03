package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085789 Partial sums of <code>n 3-spaced</code> triangular numbers beginning with <code>t(2)</code>, e.g., <code>a(2) = t(2) + t(5) = 3 + 15 = 18</code>.
 * @author Sean A. Irvine
 */
public class A085789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085789() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 54, 120});
  }
}
