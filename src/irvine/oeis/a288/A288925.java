package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288925.
 * @author Sean A. Irvine
 */
public class A288925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288925() {
    super(new long[] {-2, 3, 0, 1, 1}, new long[] {2, 4, 8, 13, 26});
  }
}
