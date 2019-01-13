package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037515.
 * @author Sean A. Irvine
 */
public class A037515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037515() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 12, 73, 440});
  }
}
