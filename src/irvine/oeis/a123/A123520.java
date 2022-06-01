package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123520 Number of vertical dominoes in all possible tilings of a 2n X 3 grid by dominoes.
 * @author Sean A. Irvine
 */
public class A123520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123520() {
    super(new long[] {-1, 8, -18, 8}, new long[] {4, 28, 152, 744});
  }
}
