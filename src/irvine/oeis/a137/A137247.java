package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137247 a(n) = 4*a(n-1) - 6*a(n-2) + 6*a(n-3) - 3*a(n-4), with initial terms 0, 0, 0, 1.
 * @author Sean A. Irvine
 */
public class A137247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137247() {
    super(new long[] {-3, 6, -6, 4}, new long[] {0, 0, 0, 1});
  }
}
