package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024857 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024857() {
    super(2, new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {1, 2, 7, 11, 27, 44, 91, 147, 278, 450});
  }
}
