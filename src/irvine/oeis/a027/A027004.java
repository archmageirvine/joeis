package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027004 a(n) = T(2*n+1,n+1), T given by A026998.
 * @author Sean A. Irvine
 */
public class A027004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027004() {
    super(new long[] {1, -4, 4}, new long[] {1, 8, 26});
  }
}
