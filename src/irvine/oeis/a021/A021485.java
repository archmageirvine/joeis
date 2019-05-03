package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021485 Decimal expansion of 1/481.
 * @author Sean A. Irvine
 */
public class A021485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021485() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 0, 2, 0, 7});
  }
}
