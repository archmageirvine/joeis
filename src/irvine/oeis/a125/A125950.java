package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125950 a(0)=a(1)=...=a(9)=1; a(n) = - a(n-1) + a(n-3) + a(n-4) + a(n-5) + a(n-6) + a(n-7) - a(n-9) - a(n-10).
 * @author Sean A. Irvine
 */
public class A125950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125950() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
