package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258809 a(n) = n^8 - 1.
 * @author Sean A. Irvine
 */
public class A258809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258809() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 255, 6560, 65535, 390624, 1679615, 5764800, 16777215, 43046720});
  }
}
