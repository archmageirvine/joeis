package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027929 a(n) = T(n, 2*n-6), T given by A027926.
 * @author Sean A. Irvine
 */
public class A027929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027929() {
    super(3, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 5, 13, 33, 79, 176});
  }
}
