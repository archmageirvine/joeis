package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259042 Period 8 sequence [0, 1, 1, 1, 2, 1, 1, 1, ...].
 * @author Sean A. Irvine
 */
public class A259042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259042() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {0, 1, 1, 1, 2});
  }
}
