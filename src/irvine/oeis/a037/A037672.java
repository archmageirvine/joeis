package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037672.
 * @author Sean A. Irvine
 */
public class A037672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037672() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 29, 261, 2352});
  }
}
