package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041812 Numerators of continued fraction convergents to <code>sqrt(427)</code>.
 * @author Sean A. Irvine
 */
public class A041812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041812() {
    super(new long[] {-1, 0, 0, 0, 124, 0, 0, 0}, new long[] {20, 21, 41, 62, 2521, 2583, 5104, 7687});
  }
}
