package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244497.
 * @author Sean A. Irvine
 */
public class A244497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244497() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 11, 57, 197, 533, 1223, 2494});
  }
}
