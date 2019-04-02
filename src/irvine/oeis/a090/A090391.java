package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090391 a(n) = n*(n^4 + 30*n^3 + 395*n^2 + 2910*n + 11064)/120.
 * @author Sean A. Irvine
 */
public class A090391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090391() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 120, 312, 606, 1040, 1661});
  }
}
