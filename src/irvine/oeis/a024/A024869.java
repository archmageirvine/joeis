package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024869 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = floor( n/2 ), s = natural numbers &gt;= 2, t = natural numbers &gt;= 3.
 * @author Sean A. Irvine
 */
public class A024869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024869() {
    super(2, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {8, 10, 27, 32, 61, 70, 114});
  }
}
