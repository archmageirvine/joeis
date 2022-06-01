package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273373 Squares ending in digit 6.
 * @author Sean A. Irvine
 */
public class A273373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273373() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {16, 36, 196, 256, 576});
  }
}
