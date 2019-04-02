package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118173 Decimal representation of n-th iteration of the Rule 188 elementary cellular automaton starting with a single black cell.
 * @author Sean A. Irvine
 */
public class A118173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118173() {
    super(new long[] {-16, 0, 16, 0, 1, 0}, new long[] {1, 3, 5, 15, 29, 55});
  }
}
