package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041836 Numerators of continued fraction convergents to <code>sqrt(439)</code>.
 * @author Sean A. Irvine
 */
public class A041836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041836() {
    super(new long[] {-1, 0, 0, 0, 880, 0, 0, 0}, new long[] {20, 21, 419, 440, 18019, 18459, 368740, 387199});
  }
}
