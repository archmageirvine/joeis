package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103378 <code>a(n) = a(n-10) + a(n-11)</code> for <code>n &gt; 11</code>, and <code>a(n) = 1</code> for <code>1 &lt;= n &lt;= 11</code>.
 * @author Sean A. Irvine
 */
public class A103378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103378() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
