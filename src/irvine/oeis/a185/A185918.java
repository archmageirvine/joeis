package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185918 a(n) = 12*n^2 - 2*n - 1.
 * @author Sean A. Irvine
 */
public class A185918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185918() {
    super(new long[] {1, -3, 3}, new long[] {-1, 9, 43});
  }
}
