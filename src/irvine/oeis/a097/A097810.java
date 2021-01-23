package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097810 a(n) = 7*2^n - 3n - 6.
 * @author Sean A. Irvine
 */
public class A097810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097810() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 16});
  }
}
