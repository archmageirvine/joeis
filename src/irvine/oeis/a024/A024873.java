package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024873 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where <code>k = [ n/2 ]</code>, s = (natural numbers <code>&gt;= 2)</code>, t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024873() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {6, 8, 26, 43, 97, 156, 308, 499, 915, 1480});
  }
}
