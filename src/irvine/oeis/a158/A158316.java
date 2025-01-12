package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158316 a(n) = 400*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158316() {
    super(1, new long[] {1, -3, 3}, new long[] {398, 1596, 3594});
  }
}
