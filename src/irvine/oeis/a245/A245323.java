package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245323 a(n) = F(6*n-3)*(L(2*n-1)+1), where F = A000045 are the Fibonacci and L = A000032 are the Lucas numbers.
 * @author Sean A. Irvine
 */
public class A245323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245323() {
    super(1, new long[] {-1, 72, -1304, 6066, -1304, 72}, new long[] {4, 170, 7320, 328380, 15124186, 704915600});
  }
}
