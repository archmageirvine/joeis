package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030139 a(n+1) = sum of digits of (a(n) + a(n-1)).
 * @author Sean A. Irvine
 */
public class A030139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030139() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 5, 5, 1, 6, 7, 4, 2, 6, 8, 5, 4, 9, 4, 4, 8, 3, 2, 5, 7, 3});
  }
}
