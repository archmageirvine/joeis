package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107767 a(n) = (1 + 3^n - 2*3^(n/2))/4 if n is even, (1 + 3^n - 4*3^((n-1)/2))/4 if n odd.
 * @author Sean A. Irvine
 */
public class A107767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107767() {
    super(new long[] {9, -12, 0, 4}, new long[] {0, 1, 4, 16});
  }
}
