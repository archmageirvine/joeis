package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173598 Period 6: repeat <code>[1, 8, 7, 2, 4, 5]</code>.
 * @author Sean A. Irvine
 */
public class A173598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173598() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 8, 7, 2, 4, 5});
  }
}
