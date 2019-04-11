package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085354 <code>a(n) = 3*4^n - (n+4)*2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A085354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085354() {
    super(new long[] {16, -20, 8}, new long[] {1, 7, 36});
  }
}
