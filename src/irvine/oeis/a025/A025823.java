package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025823 Expansion of 1/((1-x^2)(1-x^9)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A025823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025823() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 0, 0, -1, -1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 2, 4});
  }
}
