package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273372 Squares ending in digit 1.
 * @author Sean A. Irvine
 */
public class A273372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273372() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 81, 121, 361, 441});
  }
}
