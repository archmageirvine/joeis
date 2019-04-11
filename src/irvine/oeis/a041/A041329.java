package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041329 Denominators of continued fraction convergents to <code>sqrt(178)</code>.
 * @author Sean A. Irvine
 */
public class A041329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041329() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3202, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 38, 41, 120, 3161, 6442, 9603, 121678, 131281, 384240});
  }
}
