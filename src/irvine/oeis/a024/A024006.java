package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024006.
 * @author Sean A. Irvine
 */
public class A024006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024006() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 0, -255, -6560, -65535, -390624, -1679615, -5764800, -16777215});
  }
}
