package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167566 The third left hand column of triangle <code>A167565</code>.
 * @author Sean A. Irvine
 */
public class A167566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167566() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 16, 67, 202, 497, 1064});
  }
}
