package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103378 a(n) = a(n-10) + a(n-11) for n &gt; 11, and a(n) = 1 for 1 &lt;= n &lt;= 11.
 * @author Sean A. Irvine
 */
public class A103378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103378() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
