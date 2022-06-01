package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195859 n^8-n.
 * @author Sean A. Irvine
 */
public class A195859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195859() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 254, 6558, 65532, 390620, 1679610, 5764794, 16777208});
  }
}
