package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168203 a(n) = 4*n - a(n-1) + 1 with n&gt;1, a(1)=0.
 * @author Sean A. Irvine
 */
public class A168203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168203() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 9, 4});
  }
}
