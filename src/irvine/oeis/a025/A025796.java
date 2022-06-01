package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025796 Expansion of 1/((1-x^2)(1-x^3)(1-x^6)).
 * @author Sean A. Irvine
 */
public class A025796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025796() {
    super(new long[] {1, 0, -1, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 1, 3, 3, 3});
  }
}
