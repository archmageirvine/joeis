package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282732 Satisfies the recurrence a(n) = 3*a(n-1)-a(n-2)+a(n-3)-2*a(n-4)+2*a(n-5).
 * @author Sean A. Irvine
 */
public class A282732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282732() {
    super(new long[] {2, -2, 1, -1, 3}, new long[] {1, 3, 9, 23, 63});
  }
}
