package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122074 a(0)=1, a(1)=6, a(n) = 7*a(n-1) - 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A122074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122074() {
    super(new long[] {-2, 7}, new long[] {1, 6});
  }
}
