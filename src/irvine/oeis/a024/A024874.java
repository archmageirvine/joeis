package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024874 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers &gt;= 2), t = (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A024874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024874() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {4, 6, 19, 31, 70, 113, 223, 361, 662, 1071});
  }
}
