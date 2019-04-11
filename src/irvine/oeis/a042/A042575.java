package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042575 Denominators of continued fraction convergents to <code>sqrt(816)</code>.
 * @author Sean A. Irvine
 */
public class A042575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042575() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9998, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 23, 76, 99, 175, 9899, 10074, 19973, 69993, 229952, 759849, 989801, 1749650});
  }
}
