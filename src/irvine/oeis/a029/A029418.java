package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029418 Expansion of 1/((1-x^6)(1-x^7)(1-x^9)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029418() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, -1, 0, -1, -1, -1, -1, 0, -1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 3, 1, 2, 2, 2, 2, 3, 3, 2, 4, 3, 4, 4, 4, 4});
  }
}
