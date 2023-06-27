package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173536 A173039(n) + A173259(n).
 * @author Sean A. Irvine
 */
public class A173536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173536() {
    super(1, new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 0, 1, 9, 4, 25, 49, 16, 81});
  }
}
