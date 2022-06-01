package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025893 Expansion of 1/((1-x^5)(1-x^9)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A025893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025893() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1});
  }
}
