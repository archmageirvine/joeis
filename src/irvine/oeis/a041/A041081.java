package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041081 Denominators of continued fraction convergents to <code>sqrt(47)</code>.
 * @author Sean A. Irvine
 */
public class A041081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041081() {
    super(new long[] {-1, 0, 0, 0, 96, 0, 0, 0}, new long[] {1, 1, 6, 7, 90, 97, 575, 672});
  }
}
