package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178829 Partial sums of (1/2)*floor(7^n/10).
 * @author Sean A. Irvine
 */
public class A178829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178829() {
    super(new long[] {7, -15, 16, -16, 9}, new long[] {0, 2, 19, 139, 979});
  }
}
