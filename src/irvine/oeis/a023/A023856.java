package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023856 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= floor((n+1)/2), s =</code> (natural numbers), <code>t =</code> (natural numbers <code>&gt;= 2)</code>.
 * @author Sean A. Irvine
 */
public class A023856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023856() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {2, 3, 10, 13, 28, 34, 60});
  }
}
