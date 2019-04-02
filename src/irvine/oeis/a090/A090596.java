package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090596 a(n) = - a(n-1) + 5*(a(n-2)+a(n-3)) - 2*(a(n-4)+a(n-5)) - 8*(a(n-6)+a(n-7)).
 * @author Sean A. Irvine
 */
public class A090596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090596() {
    super(new long[] {-8, -8, -2, -2, 5, 5, -1}, new long[] {1, 1, 2, 3, 7, 12, 24});
  }
}
