package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041761 Denominators of continued fraction convergents to <code>sqrt(401)</code>.
 * @author Sean A. Irvine
 */
public class A041761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041761() {
    super(new long[] {1, 40}, new long[] {1, 40});
  }
}
