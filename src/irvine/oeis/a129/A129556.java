package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129556.
 * @author Sean A. Irvine
 */
public class A129556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129556() {
    super(new long[] {1, -1, -38, 38, 1}, new long[] {0, 2, 21, 95, 816});
  }
}
