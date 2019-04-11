package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262602 <code>a(n) = a(n-7) + a(n-4) + a(n-1)</code> for <code>n&gt;1</code> and <code>a(n)=1</code> for <code>n&lt;=1</code>.
 * @author Sean A. Irvine
 */
public class A262602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262602() {
    super(new long[] {1, 0, 0, 1, 0, 0, 1}, new long[] {1, 1, 3, 5, 7, 9, 13});
  }
}
