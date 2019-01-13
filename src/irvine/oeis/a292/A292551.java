package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292551.
 * @author Sean A. Irvine
 */
public class A292551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292551() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, -1, 3, 4, 12, 21});
  }
}
