package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018919.
 * @author Sean A. Irvine
 */
public class A018919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018919() {
    super(new long[] {-1, 0, 3}, new long[] {3, 9, 26});
  }
}
