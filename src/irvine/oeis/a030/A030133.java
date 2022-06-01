package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030133 a(n+1) is the sum of digits of (a(n) + a(n-1)).
 * @author Sean A. Irvine
 */
public class A030133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030133() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 1, 3, 4, 7, 2, 9, 2, 2, 4, 6, 1, 7, 8, 6, 5, 2, 7, 9, 7, 7, 5, 3, 8});
  }
}
