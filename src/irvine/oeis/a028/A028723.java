package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028723 a(n) = (1/4)*floor(n/2)*floor((n-1)/2)*floor((n-2)/2)*floor((n-3)/2).
 * @author Sean A. Irvine
 */
public class A028723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028723() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 0, 0, 1, 3, 9});
  }
}
