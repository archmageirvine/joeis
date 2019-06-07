package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285551 Volume of each square prism building the next 3-dimensional box in <code>A100538</code> where side lengths form the Padovan spiral number sequence <code>(A134816)</code>, starting with <code>1 X 1 X 1, 1 X 1 X 2, 2 X 2 X 2, 2 X 2 X 3, 4 X 4 X 5, ..</code>.
 * @author Sean A. Irvine
 */
public class A285551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285551() {
    super(new long[] {-1, 0, -1, -1, -4, 4, -2, 3, 2, 1}, new long[] {1, 2, 8, 12, 36, 80, 175, 441, 972, 2304});
  }
}
