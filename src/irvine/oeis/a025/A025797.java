package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025797 Expansion of 1/((1-x^2)(1-x^3)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A025797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025797() {
    super(new long[] {1, 0, -1, -1, 0, 1, 0, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 1, 3, 2, 3, 3, 4});
  }
}
