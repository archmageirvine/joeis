package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077416 Chebyshev S-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077416() {
    super(new long[] {-1, 12}, new long[] {1, 13});
  }
}
