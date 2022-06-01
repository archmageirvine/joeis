package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129004 (n^3+n^2)*4^n.
 * @author Sean A. Irvine
 */
public class A129004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129004() {
    super(new long[] {-256, 256, -96, 16}, new long[] {8, 192, 2304, 20480});
  }
}
