package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025871 Expansion of 1/((1-x^4)(1-x^7)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A025871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025871() {
    super(new long[] {1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 1, -1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 2, 0, 1, 1, 2, 0, 1, 2, 2, 1, 1});
  }
}
