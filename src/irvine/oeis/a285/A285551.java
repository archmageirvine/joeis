package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285551.
 * @author Sean A. Irvine
 */
public class A285551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285551() {
    super(new long[] {-1, 0, -1, -1, -4, 4, -2, 3, 2, 1}, new long[] {1, 2, 8, 12, 36, 80, 175, 441, 972, 2304});
  }
}
