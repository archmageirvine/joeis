package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026476 For <code>n&gt;3, a(n) = 7*n - 21 + 2*(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A026476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026476() {
    super(new long[] {-1, 1, 1}, new long[] {9, 12, 23}, 1, 3, 4);
  }
}
