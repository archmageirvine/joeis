package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178572 Numbers with ordered partitions that have periods of length 5.
 * @author Sean A. Irvine
 */
public class A178572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178572() {
    super(1, new long[] {1, -3, 3}, new long[] {11, 47, 108});
  }
}
