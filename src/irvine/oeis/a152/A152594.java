package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152594.
 * @author Sean A. Irvine
 */
public class A152594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152594() {
    super(new long[] {-2, -5}, new long[] {1, -1});
  }
}
