package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131707 Period 12: repeat 1, 1, 3, 7, 7, 1, 9, 9, 7, 3, 3, 9 .
 * @author Sean A. Irvine
 */
public class A131707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131707() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 1, 3, 7, 7, 1, 9});
  }
}
