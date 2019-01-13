package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152759.
 * @author Sean A. Irvine
 */
public class A152759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152759() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 27});
  }
}
