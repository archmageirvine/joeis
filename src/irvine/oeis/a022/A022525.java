package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022525.
 * @author Sean A. Irvine
 */
public class A022525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022525() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 511, 19171, 242461, 1690981, 8124571, 30275911, 93864121, 253202761});
  }
}
