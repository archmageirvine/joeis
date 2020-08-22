package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029239 Expansion of 1/((1-x^2)*(1-x^8)*(1-x^10)*(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029239() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, -1, 0, 0, 0, 0, -1, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 3, 1, 3, 1, 3, 1, 4, 1, 5, 2, 6, 3, 7, 3, 8, 3, 9, 4, 10, 5, 12});
  }
}
