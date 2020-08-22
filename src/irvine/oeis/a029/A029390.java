package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029390 Expansion of 1/((1-x^5)(1-x^6)(1-x^10)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029390() {
    super(new long[] {-1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, -1, -2, -1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 2, 2, 1, 0, 0, 2, 3, 2, 1, 0, 3, 4, 4, 2, 1, 3, 5, 5, 4, 2, 5, 6});
  }
}
