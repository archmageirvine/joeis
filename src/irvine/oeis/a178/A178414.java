package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178414 Least odd number in the Collatz <code>(3x+1)</code> preimage of odd numbers not a multiple of 3.
 * @author Sean A. Irvine
 */
public class A178414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178414() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 3, 9, 7});
  }
}
