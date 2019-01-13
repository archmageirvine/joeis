package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173115.
 * @author Sean A. Irvine
 */
public class A173115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173115() {
    super(new long[] {1, -99, 99}, new long[] {0, 24, 2400});
  }
}
