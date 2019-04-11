package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024869 <code>a(n) =</code> s(1)t(n) + s(2)t(n-1) <code>+ </code>... + s(k)t(n-k+1), where k <code>= floor( n/2 ),</code> s = natural numbers <code>&gt;= 2,</code> t = natural numbers <code>&gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A024869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024869() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {8, 10, 27, 32, 61, 70, 114});
  }
}
