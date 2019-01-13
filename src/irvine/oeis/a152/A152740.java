package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152740.
 * @author Sean A. Irvine
 */
public class A152740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152740() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 33});
  }
}
