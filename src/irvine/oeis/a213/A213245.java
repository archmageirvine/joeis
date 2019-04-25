package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213245 Number of nonzero elements in <code>GF(2^n)</code> that are 7th powers.
 * @author Sean A. Irvine
 */
public class A213245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213245() {
    super(new long[] {-8, 0, 0, 9, 0, 0}, new long[] {1, 3, 1, 15, 31, 9});
  }
}
