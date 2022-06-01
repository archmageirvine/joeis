package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269222 Period 4: repeat [1,9,8,9].
 * @author Sean A. Irvine
 */
public class A269222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269222() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 9, 8, 9});
  }
}
