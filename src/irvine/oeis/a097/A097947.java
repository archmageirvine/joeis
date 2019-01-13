package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097947.
 * @author Sean A. Irvine
 */
public class A097947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097947() {
    super(new long[] {1, 4, 0, -4}, new long[] {-2, 1, -6, 16});
  }
}
