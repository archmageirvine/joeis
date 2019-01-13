package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037599.
 * @author Sean A. Irvine
 */
public class A037599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037599() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 9, 54, 325});
  }
}
