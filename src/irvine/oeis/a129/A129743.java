package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129743 a(n) = -(u^n-1)*(v^n-1) with u = 2+sqrt(3), v = 2-sqrt(3).
 * @author Sean A. Irvine
 */
public class A129743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129743() {
    super(1, new long[] {1, -5, 5}, new long[] {2, 12, 50});
  }
}
