package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108851 a(n) = 4*a(n-1) + 3*a(n-2), a(0) = 1, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A108851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108851() {
    super(new long[] {3, 4}, new long[] {1, 2});
  }
}
