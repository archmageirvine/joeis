package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168204 a(n) = 4*n - a(n-1) + 1 with n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A168204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168204() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 5});
  }
}
