package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267796 <code>a(n) = (n+1)*4^(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A267796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267796() {
    super(new long[] {-256, 32}, new long[] {4, 128});
  }
}
