package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133684 <code>a(2n) =</code> A001045(n); <code>a(1)=1</code>; for <code>n&gt;=1</code>, a(2n+1)=2*A001045(n-1).
 * @author Sean A. Irvine
 */
public class A133684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133684() {
    super(new long[] {2, 0, 1, 0}, new long[] {0, 1, 1, 0});
  }
}
