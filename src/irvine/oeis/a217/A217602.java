package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217602 Let <code>a(1) = 1</code>. If n and <code>a(n-1)</code> have the same parity, <code>a(n) = n + a(n-1),</code> otherwise <code>a(n) =</code> abs(n <code>- a(n-1))</code>.
 * @author Sean A. Irvine
 */
public class A217602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217602() {
    super(new long[] {-1, 1, -1, 1, 0, 0, 0, 0, 1, -1, 1}, new long[] {1, 1, 4, 8, 3, 3, 10, 18, 9, 1, 12});
  }
}
