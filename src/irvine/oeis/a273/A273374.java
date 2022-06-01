package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273374 Squares ending in digit 9.
 * @author Sean A. Irvine
 */
public class A273374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273374() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {9, 49, 169, 289, 529});
  }
}
