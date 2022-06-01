package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273375 Squares ending in digit 4.
 * @author Sean A. Irvine
 */
public class A273375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273375() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {4, 64, 144, 324, 484});
  }
}
