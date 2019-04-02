package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025830 Expansion of 1/((1-x^3)(1-x^4)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A025830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025830() {
    super(new long[] {1, 0, 0, -1, -1, 0, 0, 1, -1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1, 1, 2, 1, 1, 2, 3, 1, 2});
  }
}
