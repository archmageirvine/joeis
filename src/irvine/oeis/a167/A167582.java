package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167582 The third left hand column of triangle A167580.
 * @author Sean A. Irvine
 */
public class A167582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167582() {
    super(3, new long[] {-64, 192, -240, 160, -60, 12}, new long[] {3, 98, 1080, 7568, 40976, 187488});
  }
}
