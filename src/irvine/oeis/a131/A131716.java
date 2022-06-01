package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131716 Period 6: repeat [0, 1, 2, 5, 8, 9].
 * @author Sean A. Irvine
 */
public class A131716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131716() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 5, 8, 9});
  }
}
