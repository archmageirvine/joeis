package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045624 Row sums of convolution triangle A030526.
 * @author Sean A. Irvine
 */
public class A045624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045624() {
    super(1, new long[] {-272, 272, -102, 17}, new long[] {1, 11, 101, 851});
  }
}
