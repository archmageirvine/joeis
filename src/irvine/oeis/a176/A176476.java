package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176476 Partial sums of <code>A012814</code>.
 * @author Sean A. Irvine
 */
public class A176476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176476() {
    super(new long[] {-1, 5, -9, 6}, new long[] {0, 1, 6, 27});
  }
}
