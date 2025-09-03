package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119536 a(n) = 3*n^3 + 3*n.
 * @author Sean A. Irvine
 */
public class A119536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119536() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 30, 90});
  }
}
