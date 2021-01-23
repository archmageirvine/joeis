package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048515 a(n) = T(n,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048515() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {1, 5, 35, 160, 577, 1816});
  }
}
