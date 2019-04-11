package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085789 Partial sums of n 3-spaced triangular numbers beginning with t(2), e.g., <code>a(2) =</code> t(2) + t(5) <code>= 3 + 15 = 18</code>.
 * @author Sean A. Irvine
 */
public class A085789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085789() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 54, 120});
  }
}
