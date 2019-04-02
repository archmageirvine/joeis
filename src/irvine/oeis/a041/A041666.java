package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041666 Numerators of continued fraction convergents to sqrt(352).
 * @author Sean A. Irvine
 */
public class A041666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041666() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 155234, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 19, 75, 394, 3621, 18499, 59118, 77617, 2853330, 2930947, 11646171, 61161802, 562102389, 2871673747L, 9177123630L, 12048797377L});
  }
}
