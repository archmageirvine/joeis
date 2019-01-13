package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288994.
 * @author Sean A. Irvine
 */
public class A288994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288994() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 2, 5, 18, 28, 20, 27, 70, 88});
  }
}
