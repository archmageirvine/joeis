package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242763 <code>a(n) = 1</code> for <code>n &lt;= 7</code>; <code>a(n) = a(n-5) + a(n-7)</code> for <code>n&gt;7</code>.
 * @author Sean A. Irvine
 */
public class A242763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242763() {
    super(new long[] {1, 0, 1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
