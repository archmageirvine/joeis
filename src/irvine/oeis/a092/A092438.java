package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092438 Sequence arising from enumeration of domino tilings of Aztec Pillow-like regions.
 * @author Sean A. Irvine
 */
public class A092438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092438() {
    super(new long[] {6, -5, -5, 5}, new long[] {0, 2, 6, 26});
  }
}
