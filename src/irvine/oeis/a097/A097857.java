package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097857 <code>a(0) = 1, a(1) = 1, a(n) = floor((a(n-1)+a(n-2))/2) + 3</code> if <code>a(n-2)</code> is even, <code>a(n) = floor((a(n-1)-a(n-2))/2) + 3</code> if <code>a(n-2)</code> is odd.
 * @author Sean A. Irvine
 */
public class A097857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097857() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 3, 6, 4, 8, 9, 11, 4, 1, 4, 5, 7, 4, 1, 5, 5, 3, 2, 2, 5, 6, 3, 7, 5, 2, 1, 4, 4, 7, 8, 3, 8, 5, 9, 5});
  }
}
