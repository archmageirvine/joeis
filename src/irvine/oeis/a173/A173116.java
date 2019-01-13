package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173116.
 * @author Sean A. Irvine
 */
public class A173116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173116() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 80, 360, 1088});
  }
}
