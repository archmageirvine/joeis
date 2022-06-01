package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112577 A Chebyshev-related transform of the Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A112577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112577() {
    super(new long[] {-1, -1, 4, 1}, new long[] {0, 1, 1, 5});
  }
}
