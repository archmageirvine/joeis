package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110551.
 * @author Sean A. Irvine
 */
public class A110551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110551() {
    super(new long[] {1, -2, 2}, new long[] {1, 3, 5});
  }
}
