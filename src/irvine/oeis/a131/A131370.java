package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131370 a(n) = 3a(n-1) - 3a(n-2) + 2a(n-3), a(0) = 3, a(1) = 2, a(2) = 0.
 * @author Sean A. Irvine
 */
public class A131370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131370() {
    super(new long[] {2, -3, 3}, new long[] {3, 2, 0});
  }
}
