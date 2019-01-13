package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208743.
 * @author Sean A. Irvine
 */
public class A208743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208743() {
    super(new long[] {1, 1, -1, 0, 0, 0, 5, 5, -5, 0, 0, 0, -15, -15, 15, 0, 0, 0, -15, -15, 15, 0, 0, 0, 5, 5, -5, 0, 0, 0, 1, 1}, new long[] {2, 4, 8, 16, 32, 64, 96, 144, 216, 324, 486, 729, 1215, 2025, 3375, 5625, 9375, 15625, 25000, 40000, 64000, 102400, 163840, 262144, 425984, 692224, 1124864, 1827904, 2970344, 4826809, 7797153, 12595401});
  }
}
