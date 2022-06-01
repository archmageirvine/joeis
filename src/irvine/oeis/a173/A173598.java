package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173598 Period 6: repeat [1, 8, 7, 2, 4, 5].
 * @author Sean A. Irvine
 */
public class A173598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173598() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 8, 7, 2, 4, 5});
  }
}
