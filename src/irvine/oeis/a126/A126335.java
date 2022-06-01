package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126335 a(n) = n*(4*n^2+5*n-3)/2.
 * @author Sean A. Irvine
 */
public class A126335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126335() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 23, 72, 162});
  }
}
