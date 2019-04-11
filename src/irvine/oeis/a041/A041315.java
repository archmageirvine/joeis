package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041315 Denominators of continued fraction convergents to <code>sqrt(171)</code>.
 * @author Sean A. Irvine
 */
public class A041315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041315() {
    super(new long[] {-1, 0, 340, 0}, new long[] {1, 13, 339, 4420});
  }
}
