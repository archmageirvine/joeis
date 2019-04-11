package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172968 <code>a(n) = 7*a(n-1) - a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A172968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172968() {
    super(new long[] {-1, 7}, new long[] {1, 2});
  }
}
