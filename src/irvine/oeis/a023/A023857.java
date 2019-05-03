package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023857 <code>a(n) = s(1)t(n)+s(2)t(n-1)+...+s(k)t(n+1-k)</code>, where <code>k=floor((n+1)/2), s =</code> (natural numbers), <code>t =</code> (natural numbers <code>&gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A023857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023857() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 4, 13, 16, 34, 40, 70});
  }
}
