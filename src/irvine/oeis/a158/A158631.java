package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158631.
 * @author Sean A. Irvine
 */
public class A158631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158631() {
    super(new long[] {1, -3, 3}, new long[] {23, 552, 2139});
  }
}
