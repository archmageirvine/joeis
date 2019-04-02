package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139818 Squares of Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A139818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139818() {
    super(new long[] {-8, 6, 3}, new long[] {0, 1, 1});
  }
}
