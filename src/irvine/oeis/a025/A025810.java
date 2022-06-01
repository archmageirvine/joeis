package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025810 Expansion of 1/((1-x^2)(1-x^5)(1-x^10)) in powers of x.
 * @author Sean A. Irvine
 */
public class A025810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025810() {
    super(new long[] {1, 0, -1, 0, 0, -1, 0, 1, 0, 0, -1, 0, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 3, 3, 3});
  }
}
