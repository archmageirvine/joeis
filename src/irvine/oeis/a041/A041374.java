package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041374 Numerators of continued fraction convergents to <code>sqrt(202)</code>.
 * @author Sean A. Irvine
 */
public class A041374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041374() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 6282, 0, 0, 0, 0, 0, 0}, new long[] {14, 57, 71, 199, 469, 668, 3141, 88616, 357605, 446221, 1250047, 2946315, 4196362, 19731763});
  }
}
