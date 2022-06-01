package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137466 1 concatenated with n 21's.
 * @author Sean A. Irvine
 */
public class A137466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137466() {
    super(new long[] {-100, 101}, new long[] {1, 121});
  }
}
