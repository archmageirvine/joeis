package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021105 Decimal expansion of 1/101.
 * @author Sean A. Irvine
 */
public class A021105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021105() {
    super(new long[] {1, -1, 1}, new long[] {0, 0, 9});
  }
}
