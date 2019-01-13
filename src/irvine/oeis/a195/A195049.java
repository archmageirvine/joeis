package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195049.
 * @author Sean A. Irvine
 */
public class A195049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195049() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 21, 43});
  }
}
