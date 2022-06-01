package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157932 Numbers k such that (3^(35*k) + 5^(21*k) + 7^(15*k)) mod 105 is prime.
 * @author Sean A. Irvine
 */
public class A157932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157932() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 4, 6, 8});
  }
}
