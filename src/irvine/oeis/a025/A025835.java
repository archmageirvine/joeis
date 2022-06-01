package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025835 Expansion of 1/((1-x^3)(1-x^5)(1-x^6)).
 * @author Sean A. Irvine
 */
public class A025835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025835() {
    super(new long[] {1, 0, 0, -1, 0, -1, -1, 0, 1, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 3, 1});
  }
}
