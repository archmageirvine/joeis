package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037523.
 * @author Sean A. Irvine
 */
public class A037523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037523() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 13, 78, 470});
  }
}
