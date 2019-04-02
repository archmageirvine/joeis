package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112689 A modified Chebyshev transform of the Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A112689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112689() {
    super(new long[] {-1, 1, -1, 2, -1, 1}, new long[] {0, 1, 1, 0, 1, 2});
  }
}
