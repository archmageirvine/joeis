package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280261 Period length 12 sequence [0, 1, -1, 0, -1, -1, 0, -1, 1, 0, 1, 1, ...].
 * @author Sean A. Irvine
 */
public class A280261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280261() {
    super(new long[] {-1, 0, 1, 0}, new long[] {0, 1, -1, 0});
  }
}
