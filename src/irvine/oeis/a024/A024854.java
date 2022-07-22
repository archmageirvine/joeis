package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024854 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n-k+1), where k = floor(n/2), s = (natural numbers), t = (natural numbers &gt;= 3).
 * @author Sean A. Irvine
 */
public class A024854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024854() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {4, 5, 16, 19, 40, 46, 80});
  }
}
