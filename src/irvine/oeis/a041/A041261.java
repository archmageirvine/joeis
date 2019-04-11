package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041261 Denominators of continued fraction convergents to <code>sqrt(142)</code>.
 * @author Sean A. Irvine
 */
public class A041261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041261() {
    super(new long[] {-1, 0, 0, 0, 286, 0, 0, 0}, new long[] {1, 1, 11, 12, 275, 287, 3145, 3432});
  }
}
