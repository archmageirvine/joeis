package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110665 Sequence is <code>{a(0,n)}</code>, where <code>a(m,0)=0, a(m,n) = a(m-1,n)+a(m,n-1)</code> and <code>a(0,n)</code> is such that <code>a(n,n) = n</code> for all n.
 * @author Sean A. Irvine
 */
public class A110665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110665() {
    super(new long[] {-1, 2, -3, 2}, new long[] {0, 1, 0, -3});
  }
}
