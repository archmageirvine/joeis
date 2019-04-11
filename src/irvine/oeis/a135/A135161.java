package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135161 <code>a(n) = 7^n - 5^n - 3^n - 2^n.</code> Constants are the prime numbers in decreasing order.
 * @author Sean A. Irvine
 */
public class A135161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135161() {
    super(new long[] {-210, 247, -101, 17}, new long[] {-2, -3, 11, 183});
  }
}
