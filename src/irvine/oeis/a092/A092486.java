package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092486 Take natural numbers, exchange first and third quadrisection.
 * @author Sean A. Irvine
 */
public class A092486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092486() {
    super(new long[] {-1, 2, -2, 2}, new long[] {3, 2, 1, 4});
  }
}
