package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041417 Denominators of continued fraction convergents to <code>sqrt(223)</code>.
 * @author Sean A. Irvine
 */
public class A041417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041417() {
    super(new long[] {-1, 0, 0, 0, 448, 0, 0, 0}, new long[] {1, 1, 14, 15, 434, 449, 6271, 6720});
  }
}
