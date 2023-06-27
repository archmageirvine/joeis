package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254470 Sixth partial sums of fourth powers (A000583).
 * @author Sean A. Irvine
 */
public class A254470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254470() {
    super(1, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 22, 198, 1134, 4884, 17226, 52338, 141570, 348777, 795652, 1701700});
  }
}
