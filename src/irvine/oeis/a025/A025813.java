package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025813 Expansion of 1/((1-x^2)(1-x^6)(1-x^7)).
 * @author Sean A. Irvine
 */
public class A025813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025813() {
    super(new long[] {1, 0, -1, 0, 0, 0, -1, -1, 1, 1, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 2, 1, 2, 1, 2, 1, 3, 2, 4});
  }
}
