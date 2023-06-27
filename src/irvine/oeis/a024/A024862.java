package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024862 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n-k+1), where k = floor(n/2), s = natural numbers, t = odd natural numbers.
 * @author Sean A. Irvine
 */
public class A024862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024862() {
    super(2, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 5, 17, 23, 50, 62, 110});
  }
}
