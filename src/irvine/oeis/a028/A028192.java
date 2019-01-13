package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028192.
 * @author Sean A. Irvine
 */
public class A028192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028192() {
    super(new long[] {-4320, 2244, -421, 34}, new long[] {1, 34, 735, 12920});
  }
}
