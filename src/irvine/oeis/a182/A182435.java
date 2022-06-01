package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182435 a(n) = 6*a(n-1) - a(n-2) - 2 with n&gt;1, a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A182435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182435() {
    super(new long[] {1, -7, 7}, new long[] {0, 1, 4});
  }
}
