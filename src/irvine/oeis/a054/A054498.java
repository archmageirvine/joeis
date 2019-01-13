package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054498.
 * @author Sean A. Irvine
 */
public class A054498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054498() {
    super(new long[] {-1, 4, 0, -20, 20, 36, -64, -20, 90, -20, -64, 36, 20, -20, 0, 4}, new long[] {1, 4, 16, 44, 116, 260, 560, 1100, 2090, 3740, 6512, 10868, 17732, 28028, 43472, 65780});
  }
}
