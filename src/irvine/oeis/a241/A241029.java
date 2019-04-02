package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241029 Sum of n-th powers of divisors of 22.
 * @author Sean A. Irvine
 */
public class A241029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241029() {
    super(new long[] {-484, 792, -343, 36}, new long[] {4, 36, 610, 11988});
  }
}
