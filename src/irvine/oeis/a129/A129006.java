package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129006 (n^3+n^2)*6^n.
 * @author Sean A. Irvine
 */
public class A129006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129006() {
    super(1, new long[] {-1296, 864, -216, 24}, new long[] {12, 432, 7776, 103680});
  }
}
