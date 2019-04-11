package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135167 <code>a(n) = 7^n + 5^n + 3^n - 2^n.</code> Constants are the prime numbers in decreasing order.
 * @author Sean A. Irvine
 */
public class A135167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135167() {
    super(new long[] {-210, 247, -101, 17}, new long[] {2, 13, 79, 487});
  }
}
