package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041990 Numerators of continued fraction convergents to <code>sqrt(518)</code>.
 * @author Sean A. Irvine
 */
public class A041990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041990() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4734, 0, 0, 0, 0, 0}, new long[] {22, 23, 91, 569, 1798, 2367, 105946, 108313, 430885, 2693623, 8511754, 11205377});
  }
}
