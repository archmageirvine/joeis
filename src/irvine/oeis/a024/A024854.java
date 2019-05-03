package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024854 <code>a(n) = s(1)t(n) + s(2)t(n-1) +</code> ... <code>+ s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = (natural</code> numbers), <code>t = (natural</code> numbers <code>&gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A024854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024854() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {4, 5, 16, 19, 40, 46, 80});
  }
}
