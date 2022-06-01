package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135450 a(n) = 3*a(n-1) + 4*a(n-2) - a(n-3) + 3*a(n-4) + 4*a(n-5).
 * @author Sean A. Irvine
 */
public class A135450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135450() {
    super(new long[] {4, -1, 0, 4}, new long[] {0, 0, 0, 1});
  }
}
