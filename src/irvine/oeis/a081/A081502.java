package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081502 Let <code>n = 10x + y</code> where <code>0 &lt;= y &lt;= 9, x &gt;= 0</code>. Then <code>a(n) = 3x+y</code>.
 * @author Sean A. Irvine
 */
public class A081502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081502() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 3});
  }
}
