package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137357.
 * @author Sean A. Irvine
 */
public class A137357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137357() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4});
  }
}
