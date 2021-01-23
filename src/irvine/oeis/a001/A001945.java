package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001945 a(n+6) = -a(n+5) + a(n+4) + 3a(n+3) + a(n+2) - a(n+1) - a(n). a(n) = sign(n) if abs(n)&lt;=3.
 * @author Sean A. Irvine
 */
public class A001945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001945() {
    super(new long[] {-1, -1, 1, 3, 1, -1}, new long[] {0, 1, 1, 1, 5, 1});
  }
}
