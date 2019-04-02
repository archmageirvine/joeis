package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167593 The third left hand column of triangle A167591.
 * @author Sean A. Irvine
 */
public class A167593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167593() {
    super(new long[] {-64, 192, -240, 160, -60, 12}, new long[] {9, 120, 952, 5664, 27888, 120064});
  }
}
