package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092442 Sequence arising from enumeration of domino tilings of Aztec Pillow-like regions.
 * @author Sean A. Irvine
 */
public class A092442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092442() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {0, 1, 5, 19, 59});
  }
}
