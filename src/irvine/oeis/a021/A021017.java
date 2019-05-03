package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021017 Decimal expansion of 1/13.
 * @author Sean A. Irvine
 */
public class A021017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021017() {
    super(new long[] {1, -1, 0, 1}, new long[] {0, 7, 6, 9});
  }
}
