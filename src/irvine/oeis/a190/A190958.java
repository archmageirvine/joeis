package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190958 a(n) = 2*a(n-1) - 10*a(n-2), with a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A190958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190958() {
    super(new long[] {-10, 2}, new long[] {0, 1});
  }
}
