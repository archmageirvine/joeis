package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178730.
 * @author Sean A. Irvine
 */
public class A178730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178730() {
    super(new long[] {7, -8, -6, 8}, new long[] {0, 1, 8, 58});
  }
}
