package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152732.
 * @author Sean A. Irvine
 */
public class A152732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152732() {
    super(new long[] {2, 1, 1}, new long[] {0, 0, 2});
  }
}
