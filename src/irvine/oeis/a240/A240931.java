package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240931.
 * @author Sean A. Irvine
 */
public class A240931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240931() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 128, 4374, 49152, 312500, 1399680, 4941258, 14680064});
  }
}
