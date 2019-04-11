package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041607 Denominators of continued fraction convergents to <code>sqrt(321)</code>.
 * @author Sean A. Irvine
 */
public class A041607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041607() {
    super(new long[] {-1, 0, 0, 0, 430, 0, 0, 0}, new long[] {1, 1, 11, 12, 419, 431, 4729, 5160});
  }
}
