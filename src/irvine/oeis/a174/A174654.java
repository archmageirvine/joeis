package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174654 Partial sums of A030279.
 * @author Sean A. Irvine
 */
public class A174654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174654() {
    super(new long[] {1, -6, 24, -59, 108, -132, 115, -54, 12}, new long[] {1, 9, 59, 335, 1732, 8404, 38969, 174637, 762063});
  }
}
