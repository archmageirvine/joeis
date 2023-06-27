package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092491 a(n) = 2*A058094(n-2) - 5*A058094(n-3) + A058094(n-4) + a(n-1) for n &gt;=4.
 * @author Sean A. Irvine
 */
public class A092491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092491() {
    super(1, new long[] {1, -4, -4, 9, -11, 6}, new long[] {0, 0, 0, 0, 1, 6});
  }
}
