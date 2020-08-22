package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029385 Expansion of 1/((1-x^5)(1-x^6)(1-x^8)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029385() {
    super(new long[] {-1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 2, 1, 1, 1, 1, 3, 2, 2, 2, 2, 3, 4, 3, 4, 3, 4, 5, 5, 5});
  }
}
