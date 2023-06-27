package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167566 The third left hand column of triangle A167565.
 * @author Sean A. Irvine
 */
public class A167566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167566() {
    super(3, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 16, 67, 202, 497, 1064});
  }
}
