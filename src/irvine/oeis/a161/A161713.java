package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161713 a(n) = (-n^5 + 15*n^4 - 65*n^3 + 125*n^2 - 34*n + 40)/40.
 * @author Sean A. Irvine
 */
public class A161713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161713() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 4, 7, 14, 28});
  }
}
