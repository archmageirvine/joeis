package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102083 a(n) = 8*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A102083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102083() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 41});
  }
}
