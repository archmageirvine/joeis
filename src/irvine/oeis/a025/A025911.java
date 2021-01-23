package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025911 Expansion of 1/((1-x^7)(1-x^8)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A025911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025911() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 2, 0, 1});
  }
}
