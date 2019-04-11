package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239739 <code>a(n) = n*4^(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A239739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239739() {
    super(new long[] {-256, 32}, new long[] {0, 64});
  }
}
