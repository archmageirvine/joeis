package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139763 a(n)=a(n-1)+a(n-2)+a(n-3)+2a(n-4) with a(n)=n+1 for n&lt;=3.
 * @author Sean A. Irvine
 */
public class A139763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139763() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 2, 3, 4});
  }
}
