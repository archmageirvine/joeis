package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041525 Denominators of continued fraction convergents to <code>sqrt(279)</code>.
 * @author Sean A. Irvine
 */
public class A041525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041525() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3040, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 10, 27, 64, 91, 2976, 3067, 9110, 21287, 30397, 82081, 194559, 276640});
  }
}
