package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038762 a(n) = 6*a(n-1) - a(n-2) for n &gt;= 2, with a(0)=3, a(1)=13.
 * @author Sean A. Irvine
 */
public class A038762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038762() {
    super(new long[] {-1, 6}, new long[] {3, 13});
  }
}
