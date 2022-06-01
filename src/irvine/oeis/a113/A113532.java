package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113532 a(n) = 1 + 2*n + 3*n^2 + 4*n^3 + 5*n^4 + 6*n^5 + 7*n^6.
 * @author Sean A. Irvine
 */
public class A113532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113532() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 28, 769, 7108, 36409, 131836, 380713});
  }
}
