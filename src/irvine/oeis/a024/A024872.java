package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024872 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers &gt;= 2), t = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024872() {
    super(2, new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {2, 4, 12, 19, 43, 70, 138, 223, 409, 662});
  }
}
