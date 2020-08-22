package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105225 a(n+3) = 2a(n+2) - 3a(n+1) + 2a(n); a(0) = 1, a(1) = -1, a(2) = -2.
 * @author Sean A. Irvine
 */
public class A105225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105225() {
    super(new long[] {2, -3, 2}, new long[] {1, -1, -2});
  }
}
