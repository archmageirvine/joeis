package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280237 Period 8 sequence [0, 1, 0, 1, -1, 1, 0, 1, ...].
 * @author Sean A. Irvine
 */
public class A280237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280237() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, -1, 1, 0, 1});
  }
}
