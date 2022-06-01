package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110665 Sequence is {a(0,n)}, where a(m,0)=0, a(m,n) = a(m-1,n)+a(m,n-1) and a(0,n) is such that a(n,n) = n for all n.
 * @author Sean A. Irvine
 */
public class A110665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110665() {
    super(new long[] {-1, 2, -3, 2}, new long[] {0, 1, 0, -3});
  }
}
