package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245323 <code>a(n) = F(6*n-3)*(L(2*n-1)+1)</code>, where F <code>= A000045</code> are the Fibonacci and L <code>= A000032</code> are the Lucas numbers.
 * @author Sean A. Irvine
 */
public class A245323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245323() {
    super(new long[] {-1, 72, -1304, 6066, -1304, 72}, new long[] {4, 170, 7320, 328380, 15124186, 704915600});
  }
}
