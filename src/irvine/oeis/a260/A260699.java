package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260699.
 * @author Sean A. Irvine
 */
public class A260699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260699() {
    super(new long[] {1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {0, 1, 2, 6, 9, 15, 20, 28, 34});
  }
}
