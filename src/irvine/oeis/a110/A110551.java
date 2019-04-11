package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110551 Period 6: repeat <code>[1, 3, 5, 5, 3, 1]</code>.
 * @author Sean A. Irvine
 */
public class A110551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110551() {
    super(new long[] {1, -2, 2}, new long[] {1, 3, 5});
  }
}
