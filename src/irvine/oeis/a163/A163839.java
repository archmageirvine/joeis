package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163839 <code>a(n) = (2^n-1)*4^(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A163839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163839() {
    super(new long[] {-512, 48}, new long[] {0, 4});
  }
}
