package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037600.
 * @author Sean A. Irvine
 */
public class A037600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037600() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 10, 70, 491});
  }
}
