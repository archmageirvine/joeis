package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253811 Part of the y solutions of the Pell equation x^2 - 2*y^2 = +7.
 * @author Sean A. Irvine
 */
public class A253811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253811() {
    super(new long[] {-1, 6}, new long[] {3, 19});
  }
}
