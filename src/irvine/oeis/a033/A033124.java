package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033124.
 * @author Sean A. Irvine
 */
public class A033124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033124() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 6, 37, 223});
  }
}
