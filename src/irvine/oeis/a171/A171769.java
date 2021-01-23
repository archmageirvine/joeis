package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171769 Partial sums of A042964 (numbers congruent to 2 or 3 mod 4).
 * @author Sean A. Irvine
 */
public class A171769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171769() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 5, 11, 18});
  }
}
