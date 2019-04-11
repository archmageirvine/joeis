package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227316 <code>a(n) = n(n+1)</code> if <code>n == 0</code> or <code>1 (mod 4),</code> otherwise <code>a(n) = n(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A227316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227316() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 2, 3, 6, 20, 30, 21, 28, 72});
  }
}
