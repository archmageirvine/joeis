package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041391 Denominators of continued fraction convergents to <code>sqrt(210)</code>.
 * @author Sean A. Irvine
 */
public class A041391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041391() {
    super(new long[] {-1, 0, 58, 0}, new long[] {1, 2, 57, 116});
  }
}
