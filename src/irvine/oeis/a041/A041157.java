package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041157 Denominators of continued fraction convergents to <code>sqrt(88)</code>.
 * @author Sean A. Irvine
 */
public class A041157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041157() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 394, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 8, 21, 386, 793, 1179, 1972, 3151, 8274});
  }
}
