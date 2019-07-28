package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015448 <code>a(0) = 1, a(1) = 1</code>, and <code>a(n) = 4*a(n-1) + a(n-2)</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A015448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015448() {
    super(new long[] {1, 4}, new long[] {1, 1});
  }
}
