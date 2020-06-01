package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136010 <code>a(0)=20, a(1)=9;</code> for <code>n &gt;= 0, a(n+2) = 7*a(n+1) + 9*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A136010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136010() {
    super(new long[] {9, 7}, new long[] {20, 9});
  }
}
