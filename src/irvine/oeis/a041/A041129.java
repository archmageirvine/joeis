package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041129 Denominators of continued fraction convergents to <code>sqrt(73)</code>.
 * @author Sean A. Irvine
 */
public class A041129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041129() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 2136, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 11, 57, 68, 125, 2068, 2193, 4261, 23498, 121751, 145249, 267000});
  }
}
