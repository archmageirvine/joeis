package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190173 a(n) = Sum_{1 &lt;= i &lt; j &lt;= n} F(i)*F(j), where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A190173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190173() {
    super(1, new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 1, 5, 17, 52, 148});
  }
}
