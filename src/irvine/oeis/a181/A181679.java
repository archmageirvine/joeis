package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181679 a(n) = 121*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A181679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181679() {
    super(new long[] {1, -3, 3}, new long[] {123, 488, 1095});
  }
}
