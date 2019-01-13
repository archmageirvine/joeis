package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037556.
 * @author Sean A. Irvine
 */
public class A037556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037556() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 15, 106, 744});
  }
}
