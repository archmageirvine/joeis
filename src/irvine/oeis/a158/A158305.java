package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158305 324n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158305() {
    super(1, new long[] {1, -3, 3}, new long[] {322, 1292, 2910});
  }
}
