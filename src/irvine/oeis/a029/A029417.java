package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029417 Expansion of 1/((1-x^6)(1-x^7)(1-x^9)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029417() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, -1, 0, -1, -2, -1, 0, -1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 3, 5, 4});
  }
}
