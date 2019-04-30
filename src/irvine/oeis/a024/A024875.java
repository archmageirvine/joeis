package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024875 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where <code>k = floor( n/2 )</code>, s = natural numbers <code>&gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A024875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024875() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {12, 15, 38, 45, 82, 94, 148});
  }
}
