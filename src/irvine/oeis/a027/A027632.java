package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027632 Molien series for group Gamma_{3,0}(2).
 * @author Sean A. Irvine
 */
public class A027632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027632() {
    super(new long[] {1, -2, -1, 3, 1, -1, -4, 2, 5, -3, -4, 0, 4, 3, -5, -2, 4, 1, -1, -3, 1, 2}, new long[] {6, 14, 23, 45, 72, 126, 195, 315, 472, 720, 1042, 1520, 2132, 2995, 4089, 5568, 7418, 9843, 12833, 16652, 21304, 27117}, 1, 1, 4);
  }
}
