package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110451 <code>a(n) = n*(4*n^2 + 2*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A110451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110451() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 42, 129});
  }
}
