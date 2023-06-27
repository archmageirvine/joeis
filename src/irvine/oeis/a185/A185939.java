package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185939 a(n) = 9*n^2 - 6*n + 2.
 * @author Sean A. Irvine
 */
public class A185939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185939() {
    super(1, new long[] {1, -3, 3}, new long[] {5, 26, 65});
  }
}
