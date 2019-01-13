package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037698.
 * @author Sean A. Irvine
 */
public class A037698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037698() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 9, 66, 462, 3235});
  }
}
