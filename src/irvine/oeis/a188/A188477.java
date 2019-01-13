package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188477.
 * @author Sean A. Irvine
 */
public class A188477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188477() {
    super(new long[] {-1, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0}, new long[] {1, 1, 1, -8, -25, -25, -17, 32, 81, 81, 49, -72});
  }
}
