package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168205 a(n) = 4*n - a(n-1) + 1 with n&gt;1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A168205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168205() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 7, 6});
  }
}
