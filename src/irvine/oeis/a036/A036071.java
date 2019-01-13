package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036071.
 * @author Sean A. Irvine
 */
public class A036071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036071() {
    super(new long[] {3125, -3125, 1250, -250, 25}, new long[] {1, 25, 375, 4375, 43750});
  }
}
