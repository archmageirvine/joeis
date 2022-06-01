package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233831 a(n) = -2*a(n-1) -2*a(n-2) + a(n-3). a(0) = -1, a(1) = 1, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A233831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233831() {
    super(new long[] {1, -2, -2}, new long[] {-1, 1, 1});
  }
}
