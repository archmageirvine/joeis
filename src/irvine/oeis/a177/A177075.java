package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177075 a(n) = n^5 - n^3 - 2*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A177075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177075() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, -1, 17, 199, 929, 2951});
  }
}
