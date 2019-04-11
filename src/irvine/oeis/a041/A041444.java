package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041444 Numerators of continued fraction convergents to <code>sqrt(238)</code>.
 * @author Sean A. Irvine
 */
public class A041444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041444() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23326, 0, 0, 0, 0, 0, 0, 0}, new long[] {15, 31, 77, 108, 1589, 1697, 4983, 11663, 354873, 721409, 1797691, 2519100, 37065091, 39584191, 116233473, 272051137});
  }
}
