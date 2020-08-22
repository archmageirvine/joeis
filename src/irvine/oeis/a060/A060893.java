package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060893 n^8 - n^4 + 1.
 * @author Sean A. Irvine
 */
public class A060893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060893() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 241, 6481, 65281, 390001, 1678321, 5762401, 16773121});
  }
}
