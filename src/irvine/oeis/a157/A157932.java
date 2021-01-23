package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157932 Numbers n such that 3^(35n)+5^(21n)+7^(15n) mod 105 is prime.
 * @author Sean A. Irvine
 */
public class A157932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157932() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 4, 6, 8});
  }
}
