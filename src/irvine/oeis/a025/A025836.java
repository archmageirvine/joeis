package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025836 Expansion of 1/((1-x^3)(1-x^5)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A025836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025836() {
    super(new long[] {1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0, 2, 1, 1, 2, 1, 2, 2, 2});
  }
}
