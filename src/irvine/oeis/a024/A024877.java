package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024877 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where <code>k = [ n/2 ]</code>, s = (natural numbers <code>&gt;= 3)</code>, t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024877() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {9, 12, 37, 61, 133, 214, 413, 669, 1208, 1954});
  }
}
