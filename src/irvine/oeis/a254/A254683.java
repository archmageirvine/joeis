package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254683 Fifth partial sums of sixth powers (A001014).
 * @author Sean A. Irvine
 */
public class A254683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254683() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 69, 1064, 8736, 49350, 216342, 787968, 2489448, 7024407, 18074875, 43072848, 96186272});
  }
}
