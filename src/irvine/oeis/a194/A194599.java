package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194599 Units' digits of the nonzero hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A194599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194599() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 5, 8, 5, 6, 1, 0, 3, 0});
  }
}
