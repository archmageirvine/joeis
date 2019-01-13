package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077260.
 * @author Sean A. Irvine
 */
public class A077260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077260() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 3, 21, 990, 6786});
  }
}
