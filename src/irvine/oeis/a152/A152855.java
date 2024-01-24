package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152855 Period 5: Repeat [1, 2, 0, 2, 0].
 * @author Sean A. Irvine
 */
public class A152855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152855() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 2, 0, 2, 0});
  }
}
