package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152760.
 * @author Sean A. Irvine
 */
public class A152760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152760() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 36});
  }
}
