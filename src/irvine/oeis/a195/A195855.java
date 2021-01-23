package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195855 a(n) = T(9,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A195855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195855() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 101, 322, 808});
  }
}
