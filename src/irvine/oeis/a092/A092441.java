package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092441 Sequence arising from enumeration of domino tilings of Aztec Pillow-like regions.
 * @author Sean A. Irvine
 */
public class A092441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092441() {
    super(new long[] {-16, 68, -116, 101, -47, 11}, new long[] {1, 10, 65, 346, 1637, 7218});
  }
}
