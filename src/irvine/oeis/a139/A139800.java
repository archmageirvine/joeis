package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139800 a(n) = a(n-1) + a(n-2) + a(n-3) + 2*a(n-4), with a(0) = 1 and a(1) = a(2) = a(3) = 0.
 * @author Sean A. Irvine
 */
public class A139800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139800() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 0, 0, 0});
  }
}
