package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037618.
 * @author Sean A. Irvine
 */
public class A037618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037618() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 8, 35, 142});
  }
}
