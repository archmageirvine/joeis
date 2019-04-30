package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038762 <code>a(n) = 6*a(n-1) - a(n-2)</code> for <code>n &gt;= 2</code>, with <code>a(0)=3, a(1)=13</code>.
 * @author Sean A. Irvine
 */
public class A038762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038762() {
    super(new long[] {-1, 6}, new long[] {3, 13});
  }
}
