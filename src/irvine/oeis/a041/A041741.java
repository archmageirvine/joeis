package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041741 Denominators of continued fraction convergents to sqrt(390).
 * @author Sean A. Irvine
 */
public class A041741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041741() {
    super(new long[] {-1, 0, 0, 0, 158, 0, 0, 0}, new long[] {1, 1, 3, 4, 155, 159, 473, 632});
  }
}
