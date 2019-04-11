package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041029 Denominators of continued fraction convergents to <code>sqrt(19)</code>.
 * @author Sean A. Irvine
 */
public class A041029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041029() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 340, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 11, 14, 39, 326, 691, 1017, 3742, 4759, 13260});
  }
}
