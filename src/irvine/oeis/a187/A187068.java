package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187068.
 * @author Sean A. Irvine
 */
public class A187068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187068() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {1, 0, 0, 0, 1, 1});
  }
}
