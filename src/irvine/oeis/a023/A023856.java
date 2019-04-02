package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023856 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = floor((n+1)/2), s = (natural numbers), t = (natural numbers &gt;= 2).
 * @author Sean A. Irvine
 */
public class A023856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023856() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {2, 3, 10, 13, 28, 34, 60});
  }
}
