package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025818 Expansion of 1/((1-x^2)(1-x^7)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A025818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025818() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, -1, 0, 1, -1, 0, 1, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 2, 1, 2, 1, 3, 1, 3, 2, 3});
  }
}
