package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060099.
 * @author Sean A. Irvine
 */
public class A060099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060099() {
    super(new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4}, new long[] {1, 4, 13, 32, 71, 140, 259, 448, 742, 1176});
  }
}
