package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118171 Decimal representation of n-th iteration of the Rule 158 elementary cellular automaton starting with a single black cell.
 * @author Sean A. Irvine
 */
public class A118171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118171() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 7, 29, 115});
  }
}
