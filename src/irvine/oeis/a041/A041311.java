package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041311 Denominators of continued fraction convergents to <code>sqrt(168)</code>.
 * @author Sean A. Irvine
 */
public class A041311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041311() {
    super(new long[] {-1, 0, 26, 0}, new long[] {1, 1, 25, 26});
  }
}
