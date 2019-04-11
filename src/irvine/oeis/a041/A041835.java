package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041835 Denominators of continued fraction convergents to <code>sqrt(438)</code>.
 * @author Sean A. Irvine
 */
public class A041835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041835() {
    super(new long[] {-1, 0, 0, 0, 586, 0, 0, 0}, new long[] {1, 1, 13, 14, 573, 587, 7617, 8204});
  }
}
