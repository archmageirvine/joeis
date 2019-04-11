package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041753 Denominators of continued fraction convergents to <code>sqrt(396)</code>.
 * @author Sean A. Irvine
 */
public class A041753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041753() {
    super(new long[] {-1, 0, 0, 0, 398, 0, 0, 0}, new long[] {1, 1, 9, 10, 389, 399, 3581, 3980});
  }
}
