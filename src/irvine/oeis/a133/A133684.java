package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133684 a(2n) = A001045(n); a(1)=1; for n&gt;=1, a(2n+1)=2*A001045(n-1).
 * @author Sean A. Irvine
 */
public class A133684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133684() {
    super(new long[] {2, 0, 1, 0}, new long[] {0, 1, 1, 0});
  }
}
