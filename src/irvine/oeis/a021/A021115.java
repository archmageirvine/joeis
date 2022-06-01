package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021115 Decimal expansion of 1/111.
 * @author Sean A. Irvine
 */
public class A021115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021115() {
    super(new long[] {1, 0, 0}, new long[] {0, 0, 9});
  }
}
