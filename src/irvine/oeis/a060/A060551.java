package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060551.
 * @author Sean A. Irvine
 */
public class A060551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060551() {
    super(new long[] {-16, 8, 8, 4, -4, -4, 10, -4, -4, -2, 2, 2}, new long[] {0, 0, 0, 6, 12, 42, 84, 210, 420, 924, 1860, 3900});
  }
}
