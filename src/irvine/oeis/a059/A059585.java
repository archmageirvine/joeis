package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059585.
 * @author Sean A. Irvine
 */
public class A059585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059585() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 12, 68, 235, 636, 1478, 3088});
  }
}
