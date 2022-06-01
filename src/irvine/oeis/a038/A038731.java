package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038731 Number of columns in all directed column-convex polyominoes of area n+1.
 * @author Sean A. Irvine
 */
public class A038731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038731() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 10, 32});
  }
}
