package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027004 <code>a(n) = T(2*n+1,n+1)</code>, T given by <code>A026998</code>.
 * @author Sean A. Irvine
 */
public class A027004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027004() {
    super(new long[] {1, -4, 4}, new long[] {1, 8, 26});
  }
}
