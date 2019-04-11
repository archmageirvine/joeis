package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285551 Volume of each square prism building the next 3-dimensional box in A100538 where side lengths form the Padovan spiral number sequence (A134816), starting with 1 X 1 X <code>1, 1</code> X 1 X <code>2, 2</code> X 2 X <code>2, 2</code> X 2 X <code>3, 4</code> X 4 X <code>5, ..</code>.
 * @author Sean A. Irvine
 */
public class A285551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285551() {
    super(new long[] {-1, 0, -1, -1, -4, 4, -2, 3, 2, 1}, new long[] {1, 2, 8, 12, 36, 80, 175, 441, 972, 2304});
  }
}
