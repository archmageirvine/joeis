package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105374 a(n) = 4*n^3 + 4*n.
 * @author Sean A. Irvine
 */
public class A105374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105374() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 40, 120});
  }
}
