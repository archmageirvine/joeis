package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111400.
 * @author Sean A. Irvine
 */
public class A111400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111400() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 3, 31, 251, 1485, 6665, 24073, 73486, 196626});
  }
}
