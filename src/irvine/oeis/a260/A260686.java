package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260686 Period 6 zigzag sequence, repeat [0, 1, 2, 3, 2, 1].
 * @author Sean A. Irvine
 */
public class A260686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260686() {
    super(new long[] {1, -1, 0, 1}, new long[] {0, 1, 2, 3});
  }
}
