package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041795 Denominators of continued fraction convergents to sqrt(418).
 * @author Sean A. Irvine
 */
public class A041795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041795() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 67714, 0, 0, 0, 0, 0}, new long[] {1, 2, 9, 182, 737, 1656, 66977, 135610, 609417, 12323950, 49905217, 112134384});
  }
}
