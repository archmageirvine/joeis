package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208354 Number of compositions of n with at most one even part.
 * @author Sean A. Irvine
 */
public class A208354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208354() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 1, 2, 4});
  }
}
